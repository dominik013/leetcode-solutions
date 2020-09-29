using Microsoft.VisualStudio.TestTools.UnitTesting;
using LeetCode;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode010Test
	{
		[TestMethod]
		public void Leetcode010TestOne()
		{
			var output = Leetcode010.IsMatch("aa", "a");
			Assert.AreEqual(false, output);
		}

		[TestMethod]
		public void Leetcode010TestTwo()
		{
			var output = Leetcode010.IsMatch("aa", "a*");
			Assert.AreEqual(true, output);
		}

		[TestMethod]
		public void Leetcode010TestThree()
		{
			var output = Leetcode010.IsMatch("aa", "a");
			Assert.AreEqual(false, output);
		}

		[TestMethod]
		public void Leetcode010TestFour()
		{
			var output = Leetcode010.IsMatch("ab", ".*");
			Assert.AreEqual(true, output);
		}

		[TestMethod]
		public void Leetcode010TestFive()
		{
			var output = Leetcode010.IsMatch("aab", "c*a*b");
			Assert.AreEqual(true, output);
		}

		[TestMethod]
		public void Leetcode010TestSix()
		{
			var output = Leetcode010.IsMatch("mississippi", "mis*is*p*.");
			Assert.AreEqual(false, output);
		}

	}
}
