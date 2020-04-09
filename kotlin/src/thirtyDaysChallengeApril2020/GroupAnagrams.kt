package thirtyDaysChallengeApril2020

/*

Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.

 */

fun main() {
    println(GroupAnagrams.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
}

object GroupAnagrams {
    /**
     * Sorted strings approach:
     * Runtime complexity:
     * Outer loop O(n) -> running through every element in input array
     * Inner loop O(m*log(m)) -> TimSort implementation of java.util.Arrays.sort()
     * Together O(n*m*log(m)
     *
     * Space complexity:
     * O(n * m) -> space of the map that will be returned
     */
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")
            if (!map.containsKey(key)) {
                map[key] = mutableListOf()
            }
            map[key]?.add(str)
        }

        return map.values.toMutableList()
    }

    /**
     * Character count approach:
     *
     */
    fun groupAnagrams2(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            //val key =
        }

        return map.values.toMutableList()
    }
}
