package thirtyDaysChallengeApril2020

/*

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/

fun main(args: Array<String>) {
    print(IsHappy().isHappy(19))
}


class IsHappy {
    fun isHappy(n: Int): Boolean {
        var sum = n
        val history = mutableSetOf<Int>()

        while (true) {
            if (sum == 1) {
                return true
            }

            if (history.contains(sum)) {
                return false
            }

            history.add(sum)
            sum = getDigitsSum(sum)
        }
    }

    private fun getDigitsSum(n: Int): Int {
        val number = n.toString()
        var sum = 0
        for (digitString in number) {
            val digit = digitString.toInt() - '0'.toInt()
            sum += (digit * digit)
        }

        return sum
    }
}