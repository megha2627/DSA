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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return a;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> a1=new ArrayList<>();
            int p=q.size();
            for(int i=0;i<p;i++){
                TreeNode x=q.poll();
                if(x!=null){
                    a1.add(x.val);
                }
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            a.add(a1);
        }
        return a;
        
    }
}