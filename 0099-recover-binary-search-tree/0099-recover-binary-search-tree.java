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
    private TreeNode first;
    private TreeNode middle;
    private TreeNode last;
    private TreeNode prev;

    public void recoverTree(TreeNode root) {
        // Initialize
        first = middle = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);

        // Step 1: Do in-order traversal and find the two swapped nodes
        inorder(root);

        // Step 2: Fix the swapped nodes
        if (first != null && last != null) {
            // Case 1: Non-adjacent nodes swapped
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        } else if (first != null && middle != null) {
            // Case 2: Adjacent nodes swapped
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        // Left subtree
        inorder(root.left);

        // Check for swapped condition
        if (prev != null && root.val < prev.val) {
            // First anomaly
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                // Second anomaly
                last = root;
            }
        }

        // Update prev
        prev = root;

        // Right subtree
        inorder(root.right);
    }
}
