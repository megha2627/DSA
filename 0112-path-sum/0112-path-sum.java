class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // If it's a leaf node, check if the current value equals targetSum
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Recur on left and right subtrees with the reduced targetSum
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}
