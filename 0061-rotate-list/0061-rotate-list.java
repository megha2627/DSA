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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int val=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            val++;
        }
        k=k%val;
        ListNode prev=null;
        ListNode temp1=head;
        for(int i=0;i<val-k;i++){
            prev=temp1;
            temp1=temp1.next;


            
        }
        ListNode temp2=null;
        ListNode temp3=null;
        if(prev.next!=null){
            temp2=prev.next;
            temp3=prev.next;
            prev.next=null;
        }
        while(temp2!=null && temp2.next!=null){
            temp2=temp2.next;
        }
        if(temp2!=null){
            temp2.next=head;
            return temp3;
        }
        return head;
        
    }
}