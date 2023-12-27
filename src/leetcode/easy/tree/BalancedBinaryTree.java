package leetcode.easy.tree;

/**
 * {@link <a href="https://leetcode.com/problems/balanced-binary-tree/">110. Balanced Binary Tree</a>}.
 */
public class BalancedBinaryTree {
    public class TreeNode {
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

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return heightRec(root) != -1;
    }

    private int heightRec(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = heightRec(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = heightRec(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public boolean isBalancedI(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(height(root.left) - height(root.right)) > 1) return false;

        return isBalancedI(root.left) && isBalancedI(root.right);
    }

    public int height(TreeNode root) {
        if (root == null) return 0;

        //we are adding 1 here, because we have to consider the root also
        int lh = 1 + height(root.left);
        int rh = 1 + height(root.right);

        return Math.max(lh, rh);
    }
}
