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
        ListNode temp=head;
        
       int i=0;
        ListNode temp1=head;
       while(temp1!=null){
        temp1=temp1.next;
        i++;
       }
       if(n==i){
        return head.next;
       }
       int n1=i-n;
       int v=0;
        while(temp!=null && v!=n1-1){
            temp=temp.next;
            v++;
          
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
       
        return head;
        
    }
}