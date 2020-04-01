package thirtyDaysChallengeApril2020

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

fun main(args: Array<String>) {
    var result = Solution().singleNumber(intArrayOf(1, 2, 2, 4, 4))
    println(result)

    result = Solution().singleNumberBitManipulation(intArrayOf(1, 2, 2, 4, 4))
    println(result)
}

class Solution {
    fun singleNumber(nums: IntArray): Int {
        val set = mutableSetOf<Int>()
        for (number in nums) {
            if (set.contains(number)) {
                set.remove(number)
            } else {
                set.add(number)
            }
        }

        return set.first()
    }

    fun singleNumberBitManipulation(nums: IntArray): Int {
        var result = 0
        for (number in nums) {
            result = result.xor(number)
        }
        return result
    }
}