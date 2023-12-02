class CustomCustoms {
    fun run(input: String): Int {
        val testCases = input.splitAnswers()
        val count = HashSet<Char>()
        var total = 0
        for (testCase in testCases) {
            for (s in testCase.split("\n")) {
                val v = s.asIterable()
                count.addAll(v)
            }
            total += count.size
            count.clear()
        }
        return total
    }

    fun runIntersection(input: String): Int {
        val testCases = input.splitAnswers()
        var total = 0
        for (testCase in testCases) {
            val responses = testCase.split("\n")
            var intersection: Set<Char> = responses.first().asIterable().toHashSet()
            for (s in responses) {
                intersection = intersection.intersect(s.asIterable())
            }
            total += intersection.size
        }
        return total
    }
}