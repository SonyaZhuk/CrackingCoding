package leetcode.easy.tree;

/**
 * {@link <a href="https://leetcode.com/problems/path-sum/">112. Path Sum</a>}.
 */
public class PathSum {
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSumRec(root, targetSum, 0);
    }

    private boolean hasPathSumRec(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            sum = sum + root.val;
            if (sum == targetSum) return true;
        }

        boolean isLeftPath = hasPathSumRec(root.left, targetSum, sum + root.val);
        boolean isRightPath = hasPathSumRec(root.right, targetSum, sum + root.val);

        return isLeftPath || isRightPath;
    }
}
