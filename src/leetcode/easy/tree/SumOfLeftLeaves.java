package leetcode.easy.tree;

/**
 * {@link <a href="https://leetcode.com/problems/sum-of-left-leaves/">404. Sum of Left Leaves</a>}.
 */
public class SumOfLeftLeaves {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;

        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = sum + root.left.val;
        }

        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
