class Solution {
    public ListNode swapPairs(ListNode head) {
        // Dummy node to simplify edge case handling
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // Swapping
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Moving pointers forward
            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}
