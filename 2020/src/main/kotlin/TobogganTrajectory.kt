class TobogganTrajectory {
    fun run(input: String, dx: Int = 3, dy: Int = 1): Long {
        val lines = input.split("\n")
        var count = 0L
        val width = lines[0].length
        var i = 0
        while (i * dy < lines.size) {
            if (lines[i * dy][(((i) * dx)) % width] == '#') {
                count++
            }
            ++i
        }
        return count
    }
}