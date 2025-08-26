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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        ListNode prev=null;
        left=left-1;
        right=right-1;
        int count=0;
        while(temp!=null){
            if(count==left){
                break;
            }
            prev=temp;
            temp=temp.next;
            count=count+1;
        }
        ListNode left1=temp;
        while(temp!=null){
            if(count==right){
                break;
            }
            count=count+1;
            temp=temp.next;
        }
        ListNode right1=temp;
        ListNode next11=temp.next;
        ListNode curr=left1;
        ListNode prev1=next11;
        ListNode next=null;
        for(int i=left;i<=right;i++){
            next=curr.next;
            curr.next=prev1;
            prev1=curr;
            curr=next;
        }
        if(prev==null){
            head=right1;
        }else{
            prev.next=right1;

        }
        
        return head;
    }
}