namespace LeetCode
{
    public class Leetcode026
    {
        public static int RemoveDuplicates(int[] nums)
        {
            if (nums.Length == 0) return 0;
            int j = 0;
            for (int i = 1; i < nums.Length; i++)
            {
                if (nums[i] != nums[j]) nums[++j] = nums[i];
            }

            return ++j;
        }
    }
}