package thirtyDaysChallengeApril2020

import java.util.*


/*

Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

Note: The length of the given binary array will not exceed 50,000.

 */

fun main() {
    println(ContiguousArray.findMaxLength(intArrayOf(0, 1, 0)))
}

object ContiguousArray {
    fun findMaxLength2(nums: IntArray): Int {
        var maxSize = 0

        for (i in nums.indices) {
            var zeroes = 0
            var ones = 0
            var size = 0

            for (j in i until nums.size) {
                if (nums[j] == 0) {
                    zeroes++
                } else {
                    ones++
                }
                size++

                if (zeroes == ones && size > maxSize) {
                    maxSize = size
                }
            }
        }

        return maxSize
    }

    fun findMaxLength(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        var max = 0
        var zero = 0
        for (i in nums.indices) {
            if (nums[i] == 0) zero++ else zero--
            if (zero == 0) max = i + 1
            if (!map.containsKey(zero))
                map[zero] = i
            else
                max = Math.max(max, i - map[zero]!!)
        }
        return max
    }
}