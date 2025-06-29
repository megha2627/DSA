/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    int pre;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pre=inorder.length-1;
        return helper(postorder, inorder, 0, inorder.length - 1);
    }

    public int size(int[] inorder, int left, int right, int targetValue) {
        for (int i = left; i <= right; i++) {
            if (inorder[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode helper(int[] postorder, int[] inorder, int left, int right) {
        if (left > right) return null;

        TreeNode root = new TreeNode(postorder[pre]);
        int idx1 = size(inorder, left, right, postorder[pre]);
        pre--;
        root.right = helper(postorder, inorder, idx1 + 1, right);
        root.left = helper(postorder, inorder, left, idx1 - 1);
        

        return root;
    }
}
