package thirtyDaysChallengeApril2020

/*

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

 */


fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    minStack.getMin()
    minStack.pop()
    minStack.top()
    minStack.getMin()
}


class MinStack() {
    private var head: Node? = null

    fun push(x: Int) {
        if (head == null) {
            head = Node(x, x)
        } else {
            head?.let { top ->
                val node = Node(x, Math.min(x, top.minValue))
                node.next = top
                head = node
            }
        }
    }

    fun pop() {
        val temp = head?.next ?: return
        head?.next = null
        head = temp
    }

    fun top(): Int {
        return head?.value ?: 0
    }

    fun getMin(): Int {
        return head?.minValue ?: 0
    }

    class Node(var value: Int, var minValue: Int) {
        var next: Node? = null
    }

}

class MinStack2() {
    /**
     * A pair of values, where the first value indicates the node's value and
     * the second value indicates the minValue from the current node
     */
    private val stack = mutableListOf<Pair<Int, Int>>()

    fun push(x: Int) = stack.add(Pair(x, Math.min(stack.lastOrNull()?.second ?: x, x)))

    fun pop() = stack.removeAt(stack.lastIndex)

    fun top(): Int = stack.last().first

    fun getMin(): Int = stack.last().second
}
