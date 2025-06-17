class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        dummy.next = head;

        ListNode prev = dummy;

        // Step 1: Move prev to node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next; // This will be the tail after reversal
        ListNode next = null;

        // Step 2: Reverse sublist between left and right
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
