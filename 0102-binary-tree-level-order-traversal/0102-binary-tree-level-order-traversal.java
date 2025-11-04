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
    List<List<Integer>> a;
    public List<List<Integer>> levelOrder(TreeNode root) {
        a=new ArrayList<>();
        if (root == null) return a;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int p=q.size();
           List<Integer> a1=new ArrayList<>();
            
            for(int i=0;i<p;i++){
                TreeNode f=q.poll();
                if(f!=null){
                     a1.add(f.val);

                }
               
                if(f.left!=null){
                    q.add(f.left);
                }
                if(f.right!=null){
                    q.add(f.right);
                }
            }
            a.add(a1);
            
        }
        return a;
        
    }
}