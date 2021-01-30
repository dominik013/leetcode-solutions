using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode
{
	public class Leetcode007
	{
		public static int Reverse(int x)
		{
			var result = new StringBuilder();

			if (x == 0) return 0;
			if (x < 0) result.Append("-");

			char[] charArray = x.ToString().ToCharArray();
			Array.Reverse(charArray);
			var number = new string(charArray);

			foreach (var character in number)
			{
				if (Char.IsDigit(character))
				{
					result.Append(character);
				} 
			}

			var output = 0;
			int.TryParse(result.ToString(), out output);

			return output;
		}
	}
}
