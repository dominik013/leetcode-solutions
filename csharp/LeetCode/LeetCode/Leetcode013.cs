
namespace LeetCode
{
	public class Leetcode013
	{
		public static int RomanToInt(string s)
		{
			int result = 0;

			string[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
			int[] number = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

			for (int i = 0; i < s.Length; i++)
			{
				for (int j = 0; j < roman.Length; j++)
				{
					var len = roman[j].Length;
					if (len == 2)
					{
						if (i < s.Length - 1 && roman[j].Equals(s.Substring(i, 2)))
						{
							result += number[j];
							i++;
							break;
						}
					}

					if (roman[j].Equals(s[i].ToString()))
					{
						result += number[j];
						break;
					}
				}
			}

			return result;
		}
	}
}
