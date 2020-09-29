using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode
{
	// 12. Integer to Roman
	public class Leetcode012
	{
		public static string IntToRoman(int num)
		{
			var result = new StringBuilder();
			string[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
			int[] number = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

			while (num != 0)
			{
				for (int i = 0; i < roman.Length; i++)
				{
					if (num >= number[i])
					{
						num -= number[i];
						result.Append(roman[i]);
						break;
					}
				}
			}
			return result.ToString();
		}
	}
}
