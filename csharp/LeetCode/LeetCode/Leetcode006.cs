using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode
{
	public class Leetcode006
	{
		public static string Convert(string s, int numRows)
		{
			if (numRows == 1) return s;

			var currentRowIndex = 0;
			var direction = -1;
			var list = new List<StringBuilder>(numRows);

			for (int i = 0; i < numRows; i++)
			{
				list.Add(new StringBuilder());
			}

			foreach (var character in s)
			{
				// Change direction
				if (currentRowIndex == 0 || currentRowIndex == (numRows - 1))
				{
					direction *= -1;
				}

				list[currentRowIndex].Append(character);

				currentRowIndex += direction;
			}

			var result = new StringBuilder();

			foreach (var sb in list)
			{
				result.Append(sb);
			}

			return result.ToString();
		}
	}
}
