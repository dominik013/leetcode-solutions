using System.Collections.Generic;
using System.Linq;
using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
    [TestClass]
    public class Leetcode017Test
    {
        [TestMethod]
        public void Leetcode017TestOne()
        {
            var output = Leetcode017.LetterCombinations("23");
            var expected = new List<string> {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
            CollectionAssert.AreEquivalent(expected, output.ToList());
        }
    }
}