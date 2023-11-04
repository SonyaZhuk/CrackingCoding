package leetcode.easy.tree;

/**
 * {@link <a href="https://leetcode.com/problems/symmetric-tree/">101. Symmetric Tree</a>}.
 */
public class SymmetricTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricBranch(root.left, root.right);
    }
    private boolean isSymmetricBranch(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;

        if (left == null || right == null || left.val != right.val) return false;

        return isSymmetricBranch(left, right)
                && isSymmetricBranch(right, left);
    }
}
