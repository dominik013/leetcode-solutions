﻿using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode
{
	// 10. Regular Expression Matching
	public class Leetcode010
	{
		public static bool IsMatch(string s, string p)
		{
			if (string.IsNullOrEmpty(p)) return string.IsNullOrEmpty(s);

			bool firstMatch = !string.IsNullOrEmpty(s) && (s[0] == p[0] || p[0] == '.');

			if (p.Length >= 2 && p[1] == '*')
			{
				return (IsMatch(s, p.Substring(2)) ||
						(firstMatch && IsMatch(s.Substring(1), p)));
			}
			else
			{
				return firstMatch && IsMatch(s.Substring(1), p.Substring(1));
			}
		}
	}
}
