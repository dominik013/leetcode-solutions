# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode((l1.val + l2.val) % 10)
        carry = 1 if (l1.val + l2.val) >= 10 else 0
        current = head
        l1 = l1.next
        l2 = l2.next

        while l1 is not None or l2 is not None:
            value1 = l1.val if l1 is not None else 0
            value2 = l2.val if l2 is not None else 0

            s = (value1 + value2 + carry) % 10
            carry = 1 if (value1 + value2 + carry) >= 10 else 0
            current.next = ListNode(s)
            current = current.next

            if l1 is not None:
                l1 = l1.next
            if l2 is not None:
                l2 = l2.next

        if carry == 1:
            current.next = ListNode(carry)
        return head


list1 = ListNode(1)
# list1.next = ListNode(8)
# list1.next.next = ListNode(3)

list2 = ListNode(9)
list2.next = ListNode(9)
# list2.next.next = ListNode(4)

res = Solution().addTwoNumbers(list1, list2)

while res is not None:
    print(res.val)
    res = res.next
