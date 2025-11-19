struct ListNode* deleteDuplicates(struct ListNode* head) {
    if (head == NULL || head->next == NULL)
        return head;

    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    dummy->val = -1;  // dummy value
    dummy->next = head;

    struct ListNode* prev = dummy;
    struct ListNode* curr = head;

    while (curr != NULL) {
        bool duplicate = false;

        while (curr->next != NULL && curr->val == curr->next->val) {
            duplicate = true;
            curr = curr->next;
        }

        if (duplicate) {
            prev->next = curr->next;
        } else {
            prev = prev->next;
        }

        curr = curr->next;
    }

    struct ListNode* result = dummy->next;
    free(dummy);

    return result;
}
