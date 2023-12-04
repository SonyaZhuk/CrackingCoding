package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">94. Binary Tree Inorder Traversal</a>}.
 */
public class BinaryTreeInorderTraversal {
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

    private List<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inorderTraversalRec(root);
        return list;
    }
    private void inorderTraversalRec(TreeNode root) {
        if (root == null) return;

        inorderTraversalRec(root.left);
        list.add(root.val);
        inorderTraversalRec(root.right);
    }
}
