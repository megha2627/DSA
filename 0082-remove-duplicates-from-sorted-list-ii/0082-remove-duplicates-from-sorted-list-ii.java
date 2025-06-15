class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node to handle edge cases like [1,1,1,2,3]
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy; // Last node before the sublist of duplicates

        while (head != null) {
            // Detect the start of a duplicate sublist
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with the same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Bypass the entire duplicate block
                prev.next = head.next;
            } else {
                // No duplicate, move prev
                prev = prev.next;
            }
            head = head.next;
        }

        return dummy.next;
    }
}
