class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0); // To handle left == 1 case
        dummy.next = head;
        ListNode temp = dummy;

        // Step 1: Move to node just before `left`
        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }

        ListNode temp1 = temp.next;         // This is the `left` node
        ListNode temp2 = temp1;             // After reversal, temp2 will be the tail of the reversed part

        // Step 2: Move to `right` node
        for (int i = left; i < right; i++) {
            temp2 = temp2.next;
        }

        ListNode temp3 = temp2.next;        // Node just after `right`

        // Step 3: Reverse sublist from temp1 to temp2
        ListNode prev = temp3;
        ListNode next = null;
        ListNode curr = temp1;
        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 4: Connect previous part to reversed sublist
        temp.next = temp2;

        return dummy.next;
    }
}
