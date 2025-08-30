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
    public ListNode oddEvenList(ListNode head) {
        List<ListNode> a=new ArrayList<>();
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int c=1;
        while(temp!=null){
            if(c==1 || (c)%2!=0){
                a.add(temp);
            }
            temp=temp.next;
            c++;

        }
        temp=head;
        c=1;

        while(temp!=null){
            if(c!=1 && (c)%2==0){
                a.add(temp);
            }
            c++;
            temp=temp.next;
            
        }
        ListNode dummy=a.get(0);
        head=dummy;

        for(int i=1;i<a.size();i++){
            dummy.next=a.get(i);
            dummy=dummy.next;

        }
        dummy.next=null;
        return head;
        
    }
}