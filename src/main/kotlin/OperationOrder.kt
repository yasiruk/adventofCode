import java.math.BigInteger

data class Op(val v: Long, val op: Char)

class OperationOrder {


    fun run(input: String, plus: Boolean = false): Long {
        return input.split("\n").map { getValue(0, it, plus).first }.sum()
    }

    fun codeGen(input: String): String {
        val contents = input.split("\n").map {
            "l.add(${it.replace("*", "mm").replace("+", "pp")})\n"
        }
        val groups = mutableListOf<MutableList<String>>()
        var c = 0
        groups.add(mutableListOf())
        for (i in contents.indices) {
            val list = groups[c]
            if (list.size < 100) {
                list.add(contents[i])
            } else {
                c++
                groups.add(mutableListOf())
            }
        }

        return groups.mapIndexed { i, g ->
            "fun kotlinCantHaveBigMethods$i(l:MutableList<Long>) {" +
                    g.joinToString(separator = "") { "\t$it" } +
                    "}"
        }.joinToString(separator = "\n\n")
    }

    fun getValue(start: Int, exp: String, plus: Boolean): Pair<Long, Int> {
        var i = start
        val stack = mutableListOf<Op>()
        var acc: Long = if (exp[i] == '(') {
            getValue(i + 1, exp, plus).let {
                i = it.second
                it.first
            }
        } else {
            exp[i++].toString().toLong()
        }
        while (i < exp.length) {
            val sub = exp[i]
            var nextI = i + 1
            when (sub) {
                ')' -> {
                    i++
                    break
                }
                '+', '*' -> {
                    val rightOperand = exp[i + 2]
                    val rightVal = if (rightOperand == '(') {
                        getValue(i + 3, exp, plus).let {
                            nextI = it.second
                            it.first
                        }
                    } else {
                        nextI = i + 3
                        rightOperand.toString().toLong()

                    }
                    stack.add(Op(rightVal, sub))
                }
                ' ' -> {

                }
                else -> error("wtf?? '$sub'")
            }
            i = nextI
        }

        if (plus) {
            var k = 0
            while (k < stack.size) {
                val op = stack[k]
                if (op.op == '+') {
                    stack.removeAt(k)
                    if (k == 0) {
                        acc += op.v
                    } else {
                        stack[k - 1] = Op(stack[k - 1].v + op.v, stack[k - 1].op)
                    }
                } else {
                    k++
                }
            }
        }

        for (j in stack.indices) {
            val op = stack[j]
            acc = if (op.op == '*') {
                acc * op.v
            } else {
                acc + op.v
            }
        }
        return acc to i
    }
}