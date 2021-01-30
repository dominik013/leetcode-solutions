using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode008Test
	{
		[TestMethod]
		public void Leetcode008TestOne()
		{
			var output = Leetcode008.MyAtoi("42");
			Assert.AreEqual(42, output);
		}

		[TestMethod]
		public void Leetcode008TestTwo()
		{
			var output = Leetcode008.MyAtoi("   -42");
			Assert.AreEqual(-42, output);
		}

		[TestMethod]
		public void Leetcode008TestThree()
		{
			var output = Leetcode008.MyAtoi("4193 with words");
			Assert.AreEqual(4193, output);
		}

		[TestMethod]
		public void Leetcode008TestFour()
		{
			var output = Leetcode008.MyAtoi("words and 987");
			Assert.AreEqual(0, output);
		}

		[TestMethod]
		public void Leetcode008TestFive()
		{
			var output = Leetcode008.MyAtoi("-91283472332");
			Assert.AreEqual(-2147483648, output);
		}
		[TestMethod]
		public void Leetcode008TestF3ive()
		{
			var output = Leetcode008.MyAtoi("20000000000000000000");
			Assert.AreEqual(2147483647, output);
		}
	}
}
