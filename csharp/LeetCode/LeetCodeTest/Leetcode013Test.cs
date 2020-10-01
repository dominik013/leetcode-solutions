using Microsoft.VisualStudio.TestTools.UnitTesting;
using LeetCode;

namespace LeetCodeTest
{
	 [TestClass]
	public class Leetcode013Test
	{
		[TestMethod]
		public void Leetcode013TestOne()
		{
			var output = Leetcode013.RomanToInt("III");
			Assert.AreEqual(3, output);
		}

		[TestMethod]
		public void Leetcode013TestTwo()
		{
			var output = Leetcode013.RomanToInt("IV");
			Assert.AreEqual(4, output);
		}

		[TestMethod]
		public void Leetcode013TestThree()
		{
			var output = Leetcode013.RomanToInt("IX");
			Assert.AreEqual(9, output);
		}
		
		[TestMethod]
		public void Leetcode013TestFour()
		{
			var output = Leetcode013.RomanToInt("LVIII");
			Assert.AreEqual(58, output);
		}

		[TestMethod]
		public void Leetcode013TestFive()
		{
			var output = Leetcode013.RomanToInt("MCMXCIV");
			Assert.AreEqual(1994, output);
		}
	}
}
