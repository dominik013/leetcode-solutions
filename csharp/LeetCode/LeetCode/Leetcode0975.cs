namespace LeetCode
{
    public class Leetcode0975
    {
        public int RangeSumBST(TreeNode root, int low, int high)
        {
            int sum = 0;
            Traverse(root, low, high, ref sum);
            return sum;
        }

        // In order traversal
        private void Traverse(TreeNode node, int low, int high, ref int sum)
        {
            if (node == null)
            {
                return;
            }
            
            // Traverse left child node
            Traverse(node.left, low, high, ref sum);
            // Sum up if conditions are met
            if (node.val >= low && node.val <= high)
            {
                sum += node.val;
            }
            // Traverse right child node
            Traverse(node.right, low, high, ref sum);
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