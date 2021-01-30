using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode
{
	// 9. Palindrome Number
	// Follow up: Coud you solve it without converting the integer to a string?
	public class Leetcode009
	{
		public static bool IsPalindrome(int x)
		{
			if (x < 0) return false;
			if (x < 10) return true;

			var numbers = new Stack<int>();
			var i = 0;
			int length = (int)(Math.Log10(x) + 1);

			for (; i < length / 2; i++)
			{
				var remainder = x % 10;
				numbers.Push(remainder);
				x /= 10;
			}

			if (length % 2 != 0)
			{
				x /= 10;
				i++;
			}

			for (; i < length; i++)
			{
				var remainder = x % 10;
				var value = numbers.Pop();
				if (remainder != value) return false;
				x /= 10;
			}

			return true;
		}

		public static bool IsPalindrome2(int x)
		{
			if (x < 0 || (x % 10 == 0 && x != 0))
			{
				return false;
			}

			int reversedNumber = 0;
			while (x > reversedNumber)
			{
				reversedNumber = reversedNumber * 10 + x % 10;
				x /= 10;
			}

			return x == reversedNumber || x == reversedNumber / 10;
		}

	}
}
