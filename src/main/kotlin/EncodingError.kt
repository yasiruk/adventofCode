import java.lang.Integer.min

class EncodingError {
    fun run2(input: String, num: Long): Long {
        val oNums = input.split("\n").map { it.toLong() }
        val nums = MutableList(oNums.size) { oNums[it] }
        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }

        for (i in nums.indices) {
            val idx = nums.binarySearch(nums[i] + num)
            if (idx > 0) {
                return oNums.subList(i + 1, idx + 1).let { it.minOrNull()!! + it.maxOrNull()!! }
            }
        }
        error("wtf???")
    }


    fun run(input: String, range: Int): Long {
        val nums = input.split("\n").map { it.toLong() }
        val sums = mutableMapOf<Int, MutableSet<Long>>()

        for (i in nums.indices) {
            val t = min(i + range - 1, nums.size - 1)
            var j = i + 1
            val set = sums.getOrPut(i) { mutableSetOf() }
            while (j <= t) {
                set.add(nums[i] + nums[j])
                j++
            }
            if (i >= range) {
                var found = false
                for (k in 1..range) {
                    if (sums[i - k]!!.contains(nums[i])) {
                        found = true
                        break
                    }
                }
                if (!found) {
                    return nums[i]
                }
            }
        }
        error("wtf?")
    }
}