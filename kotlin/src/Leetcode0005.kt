
fun main(args: Array<String>) {
    val longest = Solution().longestPalindrome("abb")
    print(longest)
}

class Solution {
    fun longestPalindrome(s: String): String {
        val length: Int = s.length

        for (currentLength in length downTo 1) {

            for (x in 0..(s.length - currentLength)) {
                val sub = s.substring(x, x + currentLength)
                if (isPalindrome(sub)) {
                    return sub
                }
            }

        }

        return ""
    }

    private fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1

        while (start < end) {
            if (s[start] != s[end]) {
                return false
            }

            start++
            end--
        }

        return true
    }
}

