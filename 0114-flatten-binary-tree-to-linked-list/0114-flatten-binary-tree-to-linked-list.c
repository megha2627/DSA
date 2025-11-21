/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* prev = NULL;

void solve(struct TreeNode* root) {
    if (root == NULL) return;

    // Save original children before modifying anything
    struct TreeNode* leftChild = root->left;
    struct TreeNode* rightChild = root->right;

    // Link previous node to current
    if (prev != NULL) {
        prev->right = root;
        prev->left = NULL;
    }

    // Move prev to current
    prev = root;

    // Continue preorder traversal
    solve(leftChild);
    solve(rightChild);
}

void flatten(struct TreeNode* root) {
    prev = NULL;      // reset global pointer
    solve(root);
}
