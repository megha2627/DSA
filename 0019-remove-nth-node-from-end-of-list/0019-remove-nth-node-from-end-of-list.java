/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        if(c<n){
            return head;
        }
       if (n == c) {
            return head.next;
        }
       temp=head;
       int k=c-n;
       for(int i=1;i<k;i++){
        temp=temp.next;

       }
       if(temp.next!=null){
        temp.next=temp.next.next;
       }
        
        return head;
    }
}