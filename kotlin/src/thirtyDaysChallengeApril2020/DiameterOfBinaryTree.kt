package thirtyDaysChallengeApril2020

/*

Given a binary tree, you need to compute the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.

 */

fun main() {
    val root = DiameterOfBinaryTree.TreeNode(1)
    root.left = DiameterOfBinaryTree.TreeNode(2)
    root.right = DiameterOfBinaryTree.TreeNode(3)
    root.left?.left = DiameterOfBinaryTree.TreeNode(4)
    root.left?.right = DiameterOfBinaryTree.TreeNode(5)

    println(DiameterOfBinaryTree.diameterOfBinaryTree(root))
}

object DiameterOfBinaryTree {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val lHeight = height(root.left)
        val rHeight = height(root.right)

        val lDiameter = diameterOfBinaryTree(root.left)
        val rDiameter = diameterOfBinaryTree(root.right)

        return Math.max(lHeight + rHeight, Math.max(lDiameter, rDiameter))
    }

    private fun height(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        return (1 + Math.max(height(node.left), height(node.right)))
    }

    class TreeNode(var value: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}