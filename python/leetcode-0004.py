from typing import List


class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums = (nums1 + nums2)
        nums.sort()

        if len(nums) % 2:
            return nums[int(len(nums) / 2)]
        else:
            mid = int(len(nums) / 2)
            return (nums[mid] + nums[mid - 1]) / 2


n1 = [1, 2]
n2 = [3, 4]

print(Solution().findMedianSortedArrays(n1, n2))

# TODO: Solution that works in O(n + m) time

