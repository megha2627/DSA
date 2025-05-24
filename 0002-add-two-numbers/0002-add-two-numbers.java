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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pq=new ListNode(0);
        ListNode p=pq;
        ListNode head1=l1;
        ListNode head2=l2;
        int s=0;
        
       
        while(head2!=null || head1!=null){
             int p1=0;
             int p2=0;
            if(head1!=null){
               p1=head1.val;
                head1=head1.next;
            }
            
            if(head2!=null){
               p2=head2.val;
            head2=head2.next;
            }
            
            int p11=p1+p2+s;
            int p4=p11%10;
            s=p11/10;
            
            ListNode q=new ListNode(p4);
            p.next=q;
           p=p.next;
           if(s>0){
            p.next=new ListNode(s);
           }
           
        }
        return pq.next;
    }
}