using System;
using LeetCode;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LeetCodeTest
{
    [TestClass]
    public class Leetcode0445Test
    {
        [TestMethod]
        public void Leetcode0445TestOne()
        {
            var first = new Leetcode0445.ListNode(7);
            first.next = new Leetcode0445.ListNode(2);
            first.next.next = new Leetcode0445.ListNode(4);
            first.next.next.next = new Leetcode0445.ListNode(3);

            var second = new Leetcode0445.ListNode(5);
            second.next = new Leetcode0445.ListNode(6);
            second.next.next = new Leetcode0445.ListNode(4);
            
            var result = Leetcode0445.AddTwoNumbers(first, second);
            Console.WriteLine("Test");

        }
    }
}