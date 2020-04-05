package thirtyDaysChallengeApril2020

/*

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

 */

fun main() {
    println(BestTimeToBuyAndSellStock2.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(BestTimeToBuyAndSellStock2.maxProfit2(intArrayOf(7, 1, 5, 3, 6, 4)))
}

object BestTimeToBuyAndSellStock2 {
    // Space Complexity: O(1); Time Complexity: O(n)
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var i = 0

        while (i < prices.size - 1) {
            // Find valley
            while (i < prices.size - 1 && prices[i] >= prices[i + 1]) {
                i++
            }
            val valley = prices[i]

            // Find peak
            while (i < prices.size - 1 && prices[i] <= prices[i + 1]) {
                i++
            }
            val peak = prices[i]

            maxProfit += (peak - valley)
        }

        return maxProfit
    }

    // Space Complexity: O(1); Time Complexity: O(n)
    fun maxProfit2(prices: IntArray): Int {
        var profit = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1]
            }
        }
        return profit
    }
}