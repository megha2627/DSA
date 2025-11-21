/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
    if(left==right || head==NULL){
        return head;
    }
    int pos=1;
    struct ListNode* prev1=NULL;
    struct ListNode* temp=head;
    while(temp!=NULL && pos!=left){
        prev1=temp;
        temp=temp->next;
        pos++;
    }
    struct ListNode* p1=temp;
    struct ListNode* p2;
    struct ListNode* prev2=NULL;
    while(temp!=NULL && pos!=right){
        pos++;
        prev2=temp;
        temp=temp->next;
    }
    p2=temp;
    struct ListNode* prev=p2->next;
    
    for(int i=left;i<=right && p1!=NULL ;i++){
        struct ListNode* v=p1->next;
       
        p1->next=prev;
         prev=p1;
         p1=v;

    }
    if (prev1 != NULL)
        prev1->next = prev;
    else
        head = prev; 


     return head;
    
    

    
}