package thirtyDaysChallengeApril2020

/*

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

 */

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)
    MoveZeroes.moveZeroes(nums)
}

object MoveZeroes {
    // Space Complexity In-Place; Runtime O(n^2)
    fun moveZeroes(nums: IntArray): Unit {
        for (i in 0 until nums.size - 1) {
            if (nums[i] == 0) {
                var j = i
                // Find next valid number
                while (nums[j] == 0 && j < nums.size - 1) {
                    j++
                }
                nums[i] = nums[j]
                nums[j] = 0
            }
        }
    }

    // Space Complexity In-Place>; Runtime O(2 * n)
    fun moveZeroes2(nums: IntArray): Unit {
        var nonZeroIndex = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i]
            }
        }

        for (i in nonZeroIndex until nums.size) {
            nums[i] = 0
        }
    }

    // Space Complexity In-Place>; Runtime O(n)
    fun moveZeroes3(nums: IntArray): Unit {
        var nonZeroIndex = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[i] = nums[nonZeroIndex].also { nums[nonZeroIndex] = nums[i] }
                nonZeroIndex++
            }
        }
    }
}