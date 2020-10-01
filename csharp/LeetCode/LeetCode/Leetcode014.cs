using System;
using System.Text;

namespace LeetCode
{
	public class Leetcode014
	{
		public static string LongestCommonPrefix(string[] strs)
		{
			if (strs.Length == 0) return String.Empty;
			int minLen = int.MaxValue;
			var longestCommonPrefix = new StringBuilder();
			bool common = true;

			foreach (var s in strs)
			{
				minLen = Math.Min(minLen, s.Length);
			}

			for (int i = 0; i < minLen && common; i++)
			{
				char currentCharacter = strs[0][i];
				for (int j = 0; j < strs.Length; j++)
				{
					if (currentCharacter != strs[j][i])
					{
						common = false;
						break;
					}
				}
				if (common) longestCommonPrefix.Append(currentCharacter);
			}

			return longestCommonPrefix.ToString();
		}
	}
}
