using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
    [TestClass]
    public class Leetcode015Test
    {
        [TestMethod]
        public void Leetcode015TestOne()
        {
            var output = Leetcode015.ThreeSum(new[] {-1, 0, 1, 2, -1, -4});
            var expectedFirst = new List<int> { -1, -1, 2 };
            var expectedSecond = new List<int> { -1, 0, 1 };

            CollectionAssert.AreEquivalent(expectedFirst, output[0].ToList());
            CollectionAssert.AreEquivalent(expectedSecond, output[1].ToList());
        }
    }
}