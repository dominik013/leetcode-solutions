using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode007Test
	{
		[TestMethod]
		public void Leetcode007TestOne()
		{
			var output = Leetcode007.Reverse(123);
			Assert.AreEqual(321, output);
		}

		[TestMethod]
		public void Leetcode007TestTwo()
		{
			var output = Leetcode007.Reverse(-123);
			Assert.AreEqual(-321, output);
		}

		[TestMethod]
		public void Leetcode007TestThree()
		{
			var output = Leetcode007.Reverse(120);
			Assert.AreEqual(21, output);
		}

		[TestMethod]
		public void Leetcode007TestFour()
		{
			var output = Leetcode007.Reverse(1534236469);
			Assert.AreEqual(0, output);
		}
	}
}
