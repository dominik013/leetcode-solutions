package thirtyDaysChallengeApril2020

/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 */

fun main(args: Array<String>) {
    println(MaxSubArray().maxSubArray2(intArrayOf(1, 2)))


    println(MaxSubArray().maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
    println(MaxSubArray().maxSubArray2(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
    println(MaxSubArray().maxSubArray3(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}

class MaxSubArray {

    // Brute force approach O(n^2)
    fun maxSubArray(nums: IntArray): Int {
        var bestSum = Int.MIN_VALUE

        for (i in nums.indices) {
            var currentSum = 0
            for (j in i until nums.size) {
                val sum = currentSum + nums[j]
                if (sum > bestSum) {
                    bestSum = sum
                }

                currentSum = sum
            }
        }

        return bestSum
    }

    // Divide and conquer approach
    fun maxSubArray2(nums: IntArray): Int {
        return maxSumForSide(nums, 0, nums.size - 1)
    }

    private fun maxSumForSide(nums: IntArray, low: Int, high: Int): Int {
        if (low == high) {
            return nums[low]
        }

        val mid = (high + low) / 2

        val maxSumLeftSide = maxSumForSide(nums, low, mid)
        val maxSumRightSide = maxSumForSide(nums, mid + 1, high)
        val maxSumOverlap = maxSumForOverlap(nums, low, mid, high)

        return maxOf(maxSumLeftSide, maxSumRightSide, maxSumOverlap)
    }

    private fun maxSumForOverlap(nums: IntArray, low: Int, mid: Int, high: Int): Int {
        // Left side
        var sumLeftSide = Int.MIN_VALUE
        var sum = 0
        for (i in mid downTo low) {
            sum += nums[i]
            if (sum > sumLeftSide) {
                sumLeftSide = sum
            }
        }

        // Right side
        var sumRightSide = Int.MIN_VALUE
        sum = 0
        for (i in (mid + 1)..high) {
            sum += nums[i]
            if (sum > sumRightSide) {
                sumRightSide = sum
            }
        }

        return sumLeftSide + sumRightSide
    }

    // Linear Runtime
    fun maxSubArray3(nums: IntArray): Int {
        var bestSum = Int.MIN_VALUE
        var currentSum = 0

        for (value in nums) {
            currentSum = Math.max(value, currentSum + value)
            bestSum = Math.max(bestSum, currentSum)
        }

        return bestSum
    }
}