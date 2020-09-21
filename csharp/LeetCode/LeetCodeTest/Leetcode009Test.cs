using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode009Test
	{
		[TestMethod]
		public void Leetcode009TestOne()
		{
			var output = Leetcode009.IsPalindrome(121);
			Assert.AreEqual(true, output);
		}

		[TestMethod]
		public void Leetcode009TestTwo()
		{
			var output = Leetcode009.IsPalindrome(-121);
			Assert.AreEqual(false, output);
		}

		[TestMethod]
		public void Leetcode009TestThree()
		{
			var output = Leetcode009.IsPalindrome(10);
			Assert.AreEqual(false, output);
		}
	}
}
