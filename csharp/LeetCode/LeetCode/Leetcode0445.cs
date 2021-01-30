using System.Collections.Generic;

namespace LeetCode
{
    public class Leetcode0445
    {
        public static LeetCode.ListNode AddTwoNumbers(ListNode l1, ListNode l2)
        {
            Stack<int> l1Stack = new Stack<int>();
            Stack<int> l2Stack = new Stack<int>();

            while (l1 != null)
            {
                l1Stack.Push(l1.val);
                l1 = l1.next;
            }
            
            while (l2 != null)
            {
                l2Stack.Push(l2.val);
                l2 = l2.next;
            }

            var carry = 0;
            LeetCode.ListNode result = null;
            while (l1Stack.Count > 0 || l2Stack.Count > 0 || carry != 0)
            {
                var num1 = l1Stack.Count != 0 ? l1Stack.Pop() : 0;
                var num2 = l2Stack.Count != 0 ? l2Stack.Pop() : 0;
                var sum = num1 + num2 + carry;

                if (result == null)
                {
                    result = new LeetCode.ListNode(sum % 10);
                }
                else
                {
                    var tmp = new LeetCode.ListNode(sum % 10);
                    tmp.next = result;
                    result = tmp;
                }

                carry = num1 + num2 + carry >= 10 ? 1 : 0;
            }

            return result;
        }
        
        public class ListNode {
            public int val;
            public ListNode next;
            public ListNode(int val=0, ListNode next=null) {
                this.val = val;
                this.next = next;
            } 
        }
    }
    
    
    
}