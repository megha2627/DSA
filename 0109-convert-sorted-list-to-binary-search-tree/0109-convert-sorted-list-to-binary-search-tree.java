class Solution {

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> a = new ArrayList<>();
        ListNode temp = head;
        
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
        }
        
        return solve(a, 0, a.size() - 1);
    }

    public TreeNode solve(List<Integer> a, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(a.get(mid));
        root.left = solve(a, left, mid - 1);
        root.right = solve(a, mid + 1, right);

        return root;
    }
}
