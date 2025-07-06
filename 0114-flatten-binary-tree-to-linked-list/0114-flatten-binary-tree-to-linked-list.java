class Solution {
    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        // Reverse preorder: right -> left -> root
        flatten(root.right);
        flatten(root.left);

        // Link current node to previously visited node
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
