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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(temp==null){
            return null;

        }
        ListNode prev=null;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                while(temp!=null && temp.next!=null && temp.val==temp.next.val){
                    temp=temp.next;
                }
                if(prev==null){
                    head=temp.next;
                    
                   
                    
                }
                else{
                    prev.next=temp.next;
                    
                }
                temp=temp.next;
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
        
    }
}