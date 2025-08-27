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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        List<ListNode> a1=new ArrayList<>();
        List<ListNode> a2=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            a1.add(temp);
            temp=temp.next;
        }
        int i=0;
        int j=a1.size()-1;
        while(i<=j){
            if (i == j) {
                a2.add(a1.get(i)); // add middle node only once
            } else {
                a2.add(a1.get(i));
                a2.add(a1.get(j));
            }
            i++;
            j--;

        }
        temp=head;
        for( i=1;i<a2.size();i++){
            temp.next=a2.get(i);
            temp=temp.next;

        }
        temp.next=null;
    

        
        
    }
}