using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode
{
    public class Leetcode015
    {
        class ListComparer : IEqualityComparer<List<int>>
        {
            public bool Equals(List<int> x, List<int> y)
            {
                return x.SequenceEqual(y);
            }

            public int GetHashCode(List<int> obj)
            {
                int hash = 19;
                
                foreach (var x in obj)
                {
                    hash = hash * 31 + x;
                }

                return hash;
            }
        }
        
        public static IList<IList<int>> ThreeSum(int[] nums)
        {
            var result = new HashSet<List<int>>(new ListComparer());

            if (nums == null || nums.Length < 3)
            {
                return new List<IList<int>>();
            }

            Array.Sort(nums);
            for (int i = 0; i < nums.Length / 2 + 1; i++)
            {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                var low = i + 1;
                var high = nums.Length - 1;

                while (low < high)
                {
                    int sum = nums[i] + nums[low] + nums[high];
                    if (sum == 0)
                    {
                        result.Add(new List<int>(){nums[i], nums[low++], nums[high--]});
                    }
                    else if (sum > 0)
                    {
                        high--;
                    }
                    else
                    {
                        low++;
                    }
                }
            }
            
            return new List<IList<int>>(result);
        }
    }
}