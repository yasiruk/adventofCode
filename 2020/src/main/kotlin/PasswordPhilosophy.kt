class PasswordPhilosophy {
    fun run(input: String, validator: (range: IntRange, c: Char, pw: String) -> Boolean = this::valid): Long {
        val lines = input.split("\n")
        var count = 0L
        for (line in lines) {
            val items = line.split(regex)
            if (validator(
                    items[0].toInt()..items[1].toInt(),
                    items[2][0], items[3]
                )
            ) {
                count++
            }
        }
        return count
    }

    fun valid(range: IntRange, c: Char, pw: String): Boolean {
        var count = 0
        for (chr: Char in pw) {
            if (chr == c) count++
        }
        return count in range
    }

    fun newValid(range: IntRange, c: Char, pw: String): Boolean {
        val s = range.first - 1
        val e = range.last - 1
        return (pw.getOrNull(s) == c) xor (pw.getOrNull(e) == c)
    }

    companion object {
        val regex = Regex("[\\s\\-:]+")
    }
}