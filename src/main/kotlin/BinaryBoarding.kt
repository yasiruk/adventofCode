class BinaryBoarding {
    fun run(input: String): Pair<Int, Int> {
        var top = 128
        var bottom = 0
        var left = 0
        var right = 8
        for (c in input) {
            when (c) {
                'F' -> top = (top + bottom) / 2
                'B' -> bottom = (top + bottom) / 2
                'L' -> right = (left + right) / 2
                'R' -> left = (left + right) / 2
            }
        }
        return bottom to left
    }
}