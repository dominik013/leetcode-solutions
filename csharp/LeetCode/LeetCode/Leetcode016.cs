using System;
using System.Collections.Generic;

namespace LeetCode
{
    public class Leetcode016
    {
        public static int ThreeSumClosest(int[] nums, int target)
        {
            var difference = int.MaxValue;
            Array.Sort(nums);
            for (int i = 0; i < nums.Length && difference != 0; i++)
            {
                var low = i + 1;
                var high = nums.Length - 1;

                while (low < high)
                {
                    int sum = nums[i] + nums[low] + nums[high];
                    if (Math.Abs(target - sum) < Math.Abs(difference))
                    {
                        difference = target - sum;
                    } 
                    
                    if (sum > target)
                    {
                        high--;
                    }
                    else
                    {
                        low++;
                    }
                }
            }

            return target - difference;
        }
    }
}