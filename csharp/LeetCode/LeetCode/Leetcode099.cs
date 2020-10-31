namespace LeetCode
{
    public class Leetcode099
    {
        private TreeNode first;
        private TreeNode second;
        private TreeNode previous;
        
        public void RecoverTree(TreeNode root)
        {
            Recover(root);

            if (first != null && second != null)
            {
                int val = first.val;
                first.val = second.val;
                second.val = val;
            }
        }

        public void Recover(TreeNode node)
        {
            if (node == null)
            {
                return;
            }
            
            Recover(node.left);

            if (previous == null)
            {
                previous = node;
            }
            else
            {
                if (node.val < previous.val)
                {
                    if (first == null)
                    {
                        first = previous;
                    }

                    second = node;
                }

                previous = node;
            }
            
            Recover(node.right);
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