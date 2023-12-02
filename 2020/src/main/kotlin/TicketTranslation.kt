data class Rule(val name: String, val a: LongRange, val b: LongRange)

class TicketTranslation {

    fun run(input: String, startsWith: String): Pair<Long, Long> {
        val sections = input.splitAnswers()
        val rules = sections[0].split("\n").map { parseRule(it) }
        val myTicket = parseTicket(sections[1].split("\n")[1])
        val otherTickets = sections[2].split("\n").let { lines ->
            lines.subList(1, lines.size).map { parseTicket(it) }
        }
        val ruleSet: List<MutableSet<Rule>> = myTicket
            .map { t ->
                rules.filter { testRule(it, t) }
                    .toMutableSet()
            }


        val answer = mutableListOf<Long>()
        for (otherTicket in otherTickets) {
            for (i in otherTicket.indices) {
                val narrowedRules = ruleSet[i].filter { testRule(it, otherTicket[i]) }
                if (narrowedRules.isEmpty()) {
                    answer.add(otherTicket[i])
                } else if(narrowedRules.size < ruleSet[i].size){
                    ruleSet[i].clear()
                    ruleSet[i].addAll(narrowedRules)
                }
            }
        }

        val sortedRules: List<MutableSet<Rule>> = ruleSet.sortedBy { it.size }
        val discoveredRules = mutableSetOf<Rule>()
        discoveredRules.add(sortedRules.first().first())
        for (i in sortedRules.indices) {
            if (sortedRules[i].size > 1) {
                sortedRules[i].removeAll(discoveredRules)
                assert(sortedRules[i].size == 1)
                discoveredRules.addAll(sortedRules[i])
            }
        }

        val answer2 = myTicket.filterIndexed { i, _ -> ruleSet[i].first().name.startsWith(startsWith) }

        return answer.sum() to answer2.reduce { a, i -> a * i }
    }

    private fun testRule(rule: Rule, v: Long) = v in rule.a || v in rule.b

    private fun parseTicket(ticket: String): List<Long> = ticket.split(",").map { it.toLong() }

    fun parseRule(rule: String): Rule {
        return rule.split(": ").let { ruleParts ->
            ruleParts[1].split(" or ").let { ranges ->
                val r1 = ranges[0].split("-").map { it.toLong() }.let { r1 ->
                    r1[0]..r1[1]
                }

                val r2 = ranges[1].split("-").map { it.toLong() }.let { r2 ->
                    r2[0]..r2[1]
                }

                Rule(ruleParts[0], r1, r2)
            }
        }
    }
}