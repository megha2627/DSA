/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return null;
        }
        Node temp=head;
        solve(temp);
        return head;
        
    }
    public Node solve(Node temp){
        Node curr=temp;
        Node tail=temp;
        
        while(curr!=null){
            Node next1=curr.next;
            if(curr.child!=null){
               
                Node tail1=solve(curr.child);
                curr.next=curr.child;
                curr.child.prev=curr;
                if(next1!=null){
                    tail1.next=next1;
                    next1.prev=tail1;
                }
                else{
                    tail1.next=null;
                }
                tail=tail1;
                curr.child=null;
            }
            else{
                tail=curr;
            }
            curr=next1;
            
        }
        return tail;
    }
}