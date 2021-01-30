using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
    [TestClass]
    public class Leetcode020Test
    {
        [TestMethod]
        public void Leetcode020TestOne()
        {
            var output = Leetcode020.IsValid("()");
            Assert.AreEqual(true, output);
        }

        [TestMethod]
        public void Leetcode020TestTwo()
        {
            var output = Leetcode020.IsValid("()[]{}");
            Assert.AreEqual(true, output);
        }

        [TestMethod]
        public void Leetcode020TestThree()
        {
            var output = Leetcode020.IsValid("(]");
            Assert.AreEqual(false, output);
        }

        [TestMethod]
        public void Leetcode020TestFour()
        {
            var output = Leetcode020.IsValid("([)]");
            Assert.AreEqual(false, output);
        }

        [TestMethod]
        public void Leetcode020TestFive()
        {
            var output = Leetcode020.IsValid("{[]}");
            Assert.AreEqual(true, output);
        }
    }
}