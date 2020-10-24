using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
    [TestClass]
    public class Leetcode021Test
    {
        [TestMethod]
        public void Leetcode020TestOne()
        {
            var first = new ListNode(1) {next = new ListNode(2) {next = new ListNode(4)}};
            var second = new ListNode(1) {next = new ListNode(3) {next = new ListNode(4)}};
            var output = Leetcode021.MergeTwoLists(first, second);
            
            Assert.AreEqual(1, output.val);
            Assert.AreEqual(1, output.next.val);
            Assert.AreEqual(2, output.next.next.val);
            Assert.AreEqual(3, output.next.next.next.val);
            Assert.AreEqual(4, output.next.next.next.next.val);
            Assert.AreEqual(4, output.next.next.next.next.next.val);
        }
    }
}