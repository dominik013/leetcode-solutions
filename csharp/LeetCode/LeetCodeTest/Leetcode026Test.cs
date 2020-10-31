using System;
using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
    [TestClass]
    public class Leetcode026Test
    {
        [TestMethod]
        public void Leetcode026TestOne()
        {
            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            var result = Leetcode026.RemoveDuplicates(nums);
            Assert.AreEqual(0, nums[0]);
            Assert.AreEqual(1, nums[1]);
            Assert.AreEqual(2, nums[2]);
            Assert.AreEqual(3, nums[3]);
            Assert.AreEqual(4, nums[4]);
        }
    }
}