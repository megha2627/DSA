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
        ListNode temp1=head;
        int c=0;
        while(temp1!=null){
            temp1=temp1.next;
            c=c+1;
        }
        if(k==0 || k%c==0){
            return head;
        }
        k=k%c;
    
        ListNode temp=head;
        for(int i=1;i<c-k;i++){
            temp=temp.next;
        }
        ListNode p=temp.next;
        temp.next=null;
        ListNode s=p;
        while(p!=null && p.next!=null){
            p=p.next;
        }
        if(p!=null){
             p.next=head;

        }
       
        return s;
        
        
    }
}