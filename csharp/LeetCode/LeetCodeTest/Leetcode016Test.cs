using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
    [TestClass]
    public class Leetcode016Test
    {
        [TestMethod]
        public void Leetcode016TestOne()
        {
            var output= Leetcode016.ThreeSumClosest(new[] {-1, 2, 1, -4}, 1);
            Assert.AreEqual(2, output);
        }

        [TestMethod]
        public void Leetcode016TestTwo()
        {
            var output= Leetcode016.ThreeSumClosest(new[] {1,1,-1,-1,3}, -1);
            Assert.AreEqual(-1, output);
        }
    }
}