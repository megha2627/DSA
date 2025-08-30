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
    public ListNode middleNode(ListNode head) {
        ListNode  current=head;
        int p=0;
        while(current!=null){
            current=current.next;
            p=p+1;
        }
        p=p/2;
        int  s=0;
        ListNode current1=head;
        while(current1!=null){
            if(p==s){
                break;
            }
            current1=current1.next;
           s=s+1;
        }
        return current1;
        
    }
}