class HandHeldHalting {
    val r = Regex("(\\w+)\\s([\\+\\-]\\d+)")
    fun run(input: String): Int {
        val originalList = input.split("\n")
        val list: MutableList<String?> = originalList.toMutableList()
        var acc = 0
        var ptr = 0
        while (list[ptr] != null && ptr < list.size) {
            val ins = list[ptr] ?: break
            list[ptr] = null
            val (op, value) = getIns(ins)
            when (op) {
                "acc" -> acc += value
                "jmp" -> {
                    ptr += value
                    continue
                }
            }
            ptr++
        }
        return acc
    }

    fun run2(input: String): Int? {
        val list: MutableList<String> = input.split("\n").toMutableList()
        val executed = MutableList(list.size) { false }

        return run(0, 0, list, executed)
    }

    fun run(
        accI: Int, ptrI: Int, instructions: MutableList<String>, executedI: List<Boolean>,
        swap: Boolean = true
    ): Int? {
        var ptr = ptrI
        var acc = accI
        val executed = executedI.toMutableList()

        while (ptr < instructions.size) {
            if (executed[ptr]) {
                return null
            }
            val (op, value) = getIns(instructions[ptr])
            executed[ptr] = true
            when (op) {
                "acc" -> {
                    acc += value
                    ptr++
                }
                "jmp" -> {
                    if (swap) {
                        return run(acc, ptr + value, instructions, executed, true)
                            ?: run(acc, ptr + 1, instructions, executed, false)
                    } else {
                        ptr += value
                    }
                }
                "nop" -> {
                    if (swap) {
                        return run(acc, ptr + 1, instructions, executed, true)
                            ?: run(acc, ptr + value, instructions, executed, false)
                    } else {
                        ptr += 1
                    }
                }
                else -> error("wtf? $op")
            }
        }

        return acc
    }

    private fun getIns(line: String): Pair<String, Int> {
        val m = r.matchEntire(line)!!
        return m.groups[1]!!.value to m.groups[2]!!.value.toInt()
    }
}