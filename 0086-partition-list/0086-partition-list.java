class Solution {
    public ListNode partition(ListNode head, int x) {
        // Dummy nodes to start the before and after lists
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);

        // Pointers to the current end of the before and after lists
        ListNode before = beforeHead;
        ListNode after = afterHead;

        // Traverse the original list
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        // Important: Terminate the after list
        after.next = null;

        // Connect the two partitions
        before.next = afterHead.next;

        // The start of the new list is at beforeHead.next
        return beforeHead.next;
    }
}
