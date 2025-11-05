/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> a1=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
    
        inorder(root);
        return a1.get(k-1);
       
        
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        a1.add(root.val);
        inorder(root.right);
    }
}