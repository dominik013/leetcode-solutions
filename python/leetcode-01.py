from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        values = {}
        for i in range(0, len(nums)):
            num = nums[i]
            complement = target - num

            if complement in values:
                return [i, values.get(complement)]

            values[num] = i

