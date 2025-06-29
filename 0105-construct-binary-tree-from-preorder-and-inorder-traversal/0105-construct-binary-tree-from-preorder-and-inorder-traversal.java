class Solution {
    int pre = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length - 1);
    }

    public int size(int[] inorder, int left, int right, int targetValue) {
        for (int i = left; i <= right; i++) {
            if (inorder[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode helper(int[] preorder, int[] inorder, int left, int right) {
        if (left > right) return null;

        TreeNode root = new TreeNode(preorder[pre]);
        int idx1 = size(inorder, left, right, preorder[pre]);
        pre++;

        root.left = helper(preorder, inorder, left, idx1 - 1);
        root.right = helper(preorder, inorder, idx1 + 1, right);

        return root;
    }
}
