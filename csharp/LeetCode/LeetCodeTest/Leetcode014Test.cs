using Microsoft.VisualStudio.TestTools.UnitTesting;
using LeetCode;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode014Test
	{
		[TestMethod]
		public void Leetcode014TestOne()
		{
			var output = Leetcode014.LongestCommonPrefix(new string[] { "flower", "flow", "flight" });
			Assert.AreEqual("fl", output);
		}

		[TestMethod]
		public void Leetcode014TestTwo()
		{
			var output = Leetcode014.LongestCommonPrefix(new string[] { "dog", "racecar", "car" });
			Assert.AreEqual("", output);
		}
	}
}