import java.util.*
import kotlin.collections.HashSet

class BagSet(ruleString: String) {
    val count: Int
    val color: String

    init {
        haveBoxes.matchEntire(ruleString)!!.let {
            this.count = it.groups[1]!!.value.toInt()
            this.color = it.groups[2]!!.value
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BagSet) return false

        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        return color.hashCode()
    }

    override fun toString(): String {
        return "BagSet(count=$count, color='$color')"
    }

    companion object {
        private val haveBoxes = Regex("(\\d+)\\s([\\w\\s]+)")
        private val noBoxes = Regex("")
    }
}

class HandyHaversacks {
    init {
        /*

*/

    }

    fun getRule(line: String): Pair<String, Set<BagSet>> {
        val a = line.split(" bags contain ")
        return a[0] to if (a[1] != "no other bags.") {
            (a[1].split(Regex("\\sbags?[\\,\\.]?\\s?"))
                .map { it.trim() }
                .filter { it.isNotBlank() }
                .map { BagSet(it) }
                .toSet())
        } else {
            setOf()
        }
    }

    private fun getRules(input: String): Map<String, Set<BagSet>> = input.split("\n")
        .map { getRule(it) }.toMap()

    private fun getParents(rules: Map<String, Set<BagSet>>): MutableMap<String, HashSet<String>> {
        val parents = mutableMapOf<String, HashSet<String>>()

        rules.forEach {
            for (bagSet in it.value) {
                parents.getOrPut(bagSet.color) { hashSetOf() }.add(it.key)
            }
        }
        return parents
    }

    fun run(input: String): Set<String> {
        val rules = getRules(input)

        val parents = getParents(rules)

        var toAdd: MutableSet<String> = parents["shiny gold"]!!
        val answers = mutableSetOf<String>()
        while (answers.addAll(toAdd)) {
            answers.addAll(toAdd)
            toAdd = hashSetOf()
            answers.forEach { parents[it]?.let { p -> toAdd.addAll(p) } }
        }
        return answers
    }

    fun totalBags(input: String): Int {
        val rules = getRules(input)

        val stack = LinkedList<String>()
        var sum = 0
        stack.add("shiny gold")
        while (stack.isNotEmpty()) {
            rules[stack.pop()]?.apply {
                forEach { bs ->
                    for (i in 1..bs.count) {
                        stack.push(bs.color)
                    }
                    sum += bs.count
                }
            }
        }
        return sum
    }
}