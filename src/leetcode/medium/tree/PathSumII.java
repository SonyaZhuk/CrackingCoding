package leetcode.medium.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/path-sum-ii/">113. Path Sum II</a>}.
 */
public class PathSumII {

    private static class TreeNode {
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

    private ArrayList<List<Integer>> res;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res = new ArrayList<>();
        if (root != null) {
            path(root, targetSum, new ArrayList<>());
        }
        return res;
    }

    private void path(TreeNode node, int targetSum, List<Integer> currList) {
        if (node == null) return;

        targetSum -= node.val;

        currList.add(node.val);

        if (node.left == null && node.right == null) {
            if (targetSum == 0) {
                res.add(new ArrayList<>(currList));
            }
            currList.remove(currList.size() - 1);
            return;
        }
        path(node.left, targetSum, currList);
        path(node.right, targetSum, currList);
        currList.remove(currList.size() - 1);
    }
}
