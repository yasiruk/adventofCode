class Couple(val a: Long, val b: Long) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Couple) return false

        return (other.a == a && other.b == b) || (other.b == a && other.a == b)

    }

    override fun hashCode(): Int {
        var result = a.hashCode()
        result = 31 * result + b.hashCode()
        return result
    }
}

class ReportRepair {
    fun run(nums: List<Long>): Long? {
        val set = hashSetOf<Long>()
        for (num in nums) {
            if (set.contains(num)) {
                return num * (2020 - num)
            } else {
                set.add(2020 - num)
            }
        }
        return null
    }

    fun getSum3(nums: List<Long>): List<Long> {
        val map: Map<Long, Int> = nums.mapIndexed { i, t -> t to i }.toMap()
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i != j) {
                    val target = 2020 - nums[i] - nums[j]
                    val idx = map[target]
                    if (idx != null && idx != i && idx != j) {
                        return listOf(nums[i], nums[j], nums[idx])
                    }
                }
            }
        }
        error("not found")
    }
}