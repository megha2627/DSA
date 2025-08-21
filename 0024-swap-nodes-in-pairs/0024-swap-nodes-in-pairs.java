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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
       
        while(temp.next!=null && temp.next.next!=null){
            
            ListNode p=temp.next;
            ListNode q=temp.next.next;
            p.next=q.next;
            q.next=p;
            temp.next=q;
            temp=p;

            
        }
        return dummy.next;
        
    }
}