using System;

namespace LeetCode
{
	// 11. Container With Most Water
	public class Leetcode011
	{
		// Bruteforce approach
		public static int MaxArea(int[] height)
		{
			int maxArea = 0;
			for (int i = 0; i < height.Length - 1; i++)
			{
				for (int j = 1; j < height.Length; j++)
				{
					var w = j - i;
					var h = Math.Min(height[i], height[j]);
					var area = w * h;
					if (area > maxArea) maxArea = area;
				}
			}
			return maxArea;
		}

		// Using two pointers -> Only moving smaller pillar potentially increases area
		public static int MaxArea2(int[] height)
		{
			int maxArea = 0;
			int left = 0;
			int right = height.Length - 1;

			while (left < right)
			{
				maxArea = Math.Max(maxArea, (right - left) * Math.Min(height[left], height[right]));
				if (height[left] < height[right])
				{
					left++;
				}
				else
				{
					right--;
				}
			}

			return maxArea;
		}

	}
}
