using System;

namespace LeetCode
{
    public class Leetcode0563
    {
        public static int FindTilt(TreeNode root)
        {
            int tilt = 0;
            Traverse(root, ref tilt);
            return tilt;
        }

        public static int Traverse(TreeNode node, ref int tilt)
        {
            if (node == null)
            {
                return 0;
            }

            int left = Traverse(node.left, ref tilt);
            int right = Traverse(node.right, ref tilt);
            
            tilt += Math.Abs(left - right);

            return left + right + node.val;
        }

        public class TreeNode
        {
            public int val;
            public TreeNode left;
            public TreeNode right;

            public TreeNode(int val = 0, TreeNode left = null, TreeNode right = null)
            {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
    }
}