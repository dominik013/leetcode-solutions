namespace LeetCode
{
    public class Leetcode0035
    {
        public int SearchInsert(int[] nums, int target)
        {
            if (nums.Length == 0 || target < nums[0]) return 0;

            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] == target)
                {
                    return i;
                }
                if (nums[i] < target && i == nums.Length - 1 || nums[i + 1] >= target)
                {
                    return i + 1;
                }
            }

            return 0;
        }
    }
}