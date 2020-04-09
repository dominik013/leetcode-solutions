package thirtyDaysChallengeApril2020

import java.util.*

/*

Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:

Can you solve it in O(N) time and O(1) space?

 */

fun main() {
    println(BackspaceStringCompare.backspaceCompare("y#fo##f", "y#f#o##f"))
    println(BackspaceStringCompare.backspaceCompare2("y#fo##f", "y#f#o##f"))
}

object BackspaceStringCompare {
    /**
     * Simple approach by keeping track of valid index
     */
    fun backspaceCompare(S: String, T: String): Boolean {
        return getBackspaceString(S) == getBackspaceString(T)
    }

    private fun getBackspaceString(data: String): String {
        val list = data.toMutableList()
        var validIndex = 0

        for (character in data) {
            if (character == '#') {
                validIndex--
                if (validIndex < 0) validIndex = 0
            } else {
                list[validIndex] = character
                validIndex++
            }
        }

        return list.subList(0, validIndex).toString()
    }

    /**
     * Stack data structure fits better for this problem than handling indices
     */
    fun backspaceCompare2(S: String, T: String): Boolean {
        return getBackspaceString2(S) == getBackspaceString2(T)
    }

    private fun getBackspaceString2(data: String): String {
        val stack = Stack<Char>()

        for (character in data) {
            if (character != '#') {
                stack.push(character)
            } else if (stack.isNotEmpty()) {
                stack.pop()
            }
        }


        return stack.toString()
    }

    /**
     * Two pointer approach, running from behind we know how many '#' are coming after a specific character
     */
}