typedef struct stack {
    char val[1000];
    struct stack* next;
} node;

node* top = NULL;

node* create(char val1[]) {
    node* temp = malloc(sizeof(node));
    strcpy(temp->val, val1);
    temp->next = NULL;
    return temp;
}

void push(char val[]) {
    node* temp = create(val);
    temp->next = top;
    top = temp;
}

char* popVal() {
    if (!top) return NULL;
    node* temp = top;
    top = top->next;

    char* s = malloc(strlen(temp->val) + 1);
    strcpy(s, temp->val);
    free(temp);

    return s;
}

bool empty() {
    return top == NULL;
}

char* simplifyPath(char* path) {
    int n = strlen(path);

    for (int i = 0; i < n;) {

        if (path[i] == '/') { i++; continue; }

        int j = i;
        while (i < n && path[i] != '/') i++;

        int p = i - j;
        char token[1000];
        strncpy(token, path + j, p);
        token[p] = '\0';

        if (strcmp(token, ".") == 0) continue;

        if (strcmp(token, "..") == 0) {
            if (!empty()) {
                char* tmp = popVal();
                free(tmp);
            }
            continue;
        }

        push(token);
    }

    char* result = malloc(500000);
    result[0] = '\0';

    // Build reversed path using recursive function
    node* curr = top;

    // Create final path in correct order
    void build(node* x) {
        if (!x) return;
        build(x->next);
        strcat(result, "/");
        strcat(result, x->val);
    }

    build(top);

    if (result[0] == '\0')
        strcpy(result, "/");

    // Free stack
    while (!empty()) {
        char* tmp = popVal();
        free(tmp);
    }

    return result;
}
