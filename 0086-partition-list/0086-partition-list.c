struct ListNode* partition(struct ListNode* head, int x) {

    if (!head) return NULL;

    struct ListNode *dummySmall = malloc(sizeof(struct ListNode));
    struct ListNode *dummyLarge = malloc(sizeof(struct ListNode));
    dummySmall->next = NULL;
    dummyLarge->next = NULL;

    struct ListNode *small = dummySmall;
    struct ListNode *large = dummyLarge;
    struct ListNode *temp  = head;

    while (temp) {
        if (temp->val < x) {
            small->next = temp;
            small = small->next;
        } else {
            large->next = temp;
            large = large->next;
        }
        temp = temp->next;
    }

    large->next = NULL;            // end the list
    small->next = dummyLarge->next;

    struct ListNode* ans = dummySmall->next;

    free(dummySmall);
    free(dummyLarge);
    return ans;
}
