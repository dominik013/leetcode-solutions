using Microsoft.VisualStudio.TestTools.UnitTesting;
using LeetCode;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode012Test
	{
		[TestMethod]
		public void Leetcode012TestOne()
		{
			var output = Leetcode012.IntToRoman(3);
			Assert.AreEqual("III", output);
		}

		[TestMethod]
		public void Leetcode012TestTwo()
		{
			var output = Leetcode012.IntToRoman(4);
			Assert.AreEqual("IV", output);
		}

		[TestMethod]
		public void Leetcode012TestThree()
		{
			var output = Leetcode012.IntToRoman(9);
			Assert.AreEqual("IX", output);
		}

		[TestMethod]
		public void Leetcode012TestFour()
		{
			var output = Leetcode012.IntToRoman(58);
			Assert.AreEqual("LVIII", output);
		}

		[TestMethod]
		public void Leetcode012TestFive()
		{
			var output = Leetcode012.IntToRoman(1994);
			Assert.AreEqual("MCMXCIV", output);
		}
	}
}
