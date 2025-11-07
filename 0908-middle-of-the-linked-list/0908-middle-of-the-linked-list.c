/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    typedef struct ListNode node;
    int count=0;
    if(head==NULL){
        return NULL;
    }
    node *temp=head;
    
    while(temp!=NULL){
        temp=temp->next;
        count++;
    }
    temp=head;
    int middle=count/2;
    for(int i=0;i<middle;i++){
        temp=temp->next;

    }
    return temp;
    
}