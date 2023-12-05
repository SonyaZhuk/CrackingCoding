package leetcode.easy.tree;

import java.util.ArrayDeque;

/**
 * {@link <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">111. Minimum Depth of Binary Tree</a>}.
 */
public class MinimumDepthOfBinaryTree {
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int cLeft = minDepth(root.left) + 1;
        int cRight = minDepth(root.right) + 1;

        if (root.left == null) return cRight;
        if (root.right == null) return cLeft;

        return Math.min(cLeft, cRight);
    }

    public int minDepthI(TreeNode root) {
        if (root == null) return 0;

        var queue = new ArrayDeque<TreeNode>();
        queue.offer(root);

        for (var depth = 1; !queue.isEmpty(); depth++) {
            for (var i = queue.size(); i > 0; i--) {
                var node = queue.poll();

                if (node.left == null && node.right == null)
                    return depth;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return -1;
    }
}
