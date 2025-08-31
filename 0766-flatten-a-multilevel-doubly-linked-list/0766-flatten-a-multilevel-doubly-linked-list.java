/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        solve(head);
        return head;
    }

    // This function flattens the list starting from 'node' and returns the tail node
    private Node solve(Node node) {
        Node curr = node;
        Node tail = node;

        while (curr != null) {
            Node nextNode = curr.next;

            // If current node has a child
            if (curr.child != null) {
                Node childHead = curr.child;

                // Flatten the child list
                Node childTail = solve(childHead);

                // Connect current node to child
                curr.next = childHead;
                childHead.prev = curr;

                // Connect child's tail to nextNode
                if (nextNode != null) {
                    childTail.next = nextNode;
                    nextNode.prev = childTail;
                }

                // Child is processed, set it to null
                curr.child = null;

                // Move tail to childTail
                tail = childTail;
            } else {
                tail = curr;
            }

            curr = nextNode;
        }

        return tail;
    }
}
