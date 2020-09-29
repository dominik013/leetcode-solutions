using Microsoft.VisualStudio.TestTools.UnitTesting;
using LeetCode;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode011Test
	{
		[TestMethod]
		public void Leetcode011TestOne()
		{
			var output = Leetcode011.MaxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
			Assert.AreEqual(49, output);
		}

		[TestMethod]
		public void Leetcode011TestTwo()
		{
			var output = Leetcode011.MaxArea2(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
			Assert.AreEqual(49, output);
		}
	}
}
