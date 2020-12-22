class PassportProcessing {
    fun getPassportStrings(input: String): List<String> {
        return input.split(Regex("\\n\\n"))
    }

    fun validateYear(year: String?, length: Int, range: IntRange): Boolean {
        return if (year != null) year.length == length &&
                year.toIntOrNull()?.let { it in range } ?: false else false
    }

    fun validateHeight(h: String?): Boolean {
        h ?: return false
        val r = Regex("(\\d+)(cm|in)")
        return r.matchEntire(h)?.let {
            val v = it.groups[1]!!.value.toInt()
            if (it.groups[2]!!.value == "cm") {
                v in 150..193
            } else {
                v in 59..76
            }
        } ?: false
    }

    fun validateColor(s: String?) = s != null && s.matches(Regex("#[\\dabcdef]{6}"))

    fun run(input: String): MutableList<Map<String, String>> {
        val passports = getPassportStrings(input)
        val items: List<Map<String, String>> = passports.map {
            it.split(Regex("[\\n\\s]")).map { e ->
                e.split(":").let { j ->
                    j[0] to j[1]
                }
            }.toMap()
        }
        val valid = mutableListOf<Map<String, String>>()
        for (pp in items) {
            if (validateYear(pp["byr"], 4, 1920..2002) &&
                validateYear(pp["iyr"], 4, 2010..2020) &&
                validateYear(pp["eyr"], 4, 2020..2030) &&
                validateHeight(pp["hgt"]) &&
                validateColor(pp["hcl"]) &&
                (pp["ecl"]?.matches(Regex("(amb|blu|brn|gry|grn|hzl|oth)")) == true) &&
                (pp["pid"]?.matches(Regex("[\\d]{9}"))) == true
            ) {
                valid.add(pp)
            }
        }
        return valid
    }
}