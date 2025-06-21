class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return buildTrees(1, n);
    }

    private List<TreeNode> buildTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();

        // Base case: return a list with a single null to represent an empty tree
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        // Try each number as the root
        for (int i = start; i <= end; i++) {
            // All possible left subtrees if i is chosen as root
            List<TreeNode> leftTrees = buildTrees(start, i - 1);
            // All possible right subtrees if i is chosen as root
            List<TreeNode> rightTrees = buildTrees(i + 1, end);

            // Combine each left and right tree with i as root
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    allTrees.add(root);
                }
            }
        }

        return allTrees;
    }
}
