using Microsoft.VisualStudio.TestTools.UnitTesting;
using LeetCode;

namespace LeetCodeTest
{
	[TestClass]
	public class Leetcode006Test
	{
		[TestMethod]
		public void Leetcode006TestOne()
		{
			var output = Leetcode006.Convert("PAYPALISHIRING", 3);
			Assert.AreEqual("PAHNAPLSIIGYIR", output);
		}

		[TestMethod]
		public void Leetcode006TestTwo()
		{
			var output = Leetcode006.Convert("PAYPALISHIRING", 4);
			Assert.AreEqual("PINALSIGYAHRPI", output);
		}
	}
}
