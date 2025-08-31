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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        c=c/k;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev1=dummy;
        
        temp=head;
        for(int i=1;i<=c;i++){
            ListNode prev=null;
            ListNode temp1=temp;
            for(int j=1;j<=k;j++){
                ListNode next1=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next1;


            }
            prev1.next=prev;
            temp1.next=temp;
            prev1=temp1;
        }
        return dummy.next;
    }
}