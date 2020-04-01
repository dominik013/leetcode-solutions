
# Given a string, find the length of the longest substring without repeating characters.


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = []
        max_count = 0
        for letter in s:
            if letter in seen:
                idx = seen.index(letter)
                seen = seen[idx + 1:len(seen)]
            seen.append(letter)
            if len(seen) > max_count:
                max_count = len(seen)

        return max_count


x = Solution().lengthOfLongestSubstring('pwwkew')
print(x)

