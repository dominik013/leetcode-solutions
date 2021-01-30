using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode
{
	// 8. String to Integer (atoi)
	public class Leetcode008
	{
		public static int MyAtoi(string str)
		{
			var input = str.Trim();
			var result = 0L;
			var sign = 1;
			var idx = 0;

			if (string.IsNullOrWhiteSpace(input))
			{
				return 0;
			}

			if (input[0] == '-' || input[0] == '+')
			{
				sign = input[0] == '+' ? 1 : -1;
				idx++;
			}

			while (idx < input.Length)
			{
				if (Char.IsNumber(input[idx])) 
				{
					result = result * 10 + input[idx] - '0';
					if (result * sign > int.MaxValue) return int.MaxValue;
					if (result * sign < int.MinValue) return int.MinValue;
				}
				else
				{
					break;
				}

				idx++;
			}

			return (int) result * sign;
		}
	}
}
