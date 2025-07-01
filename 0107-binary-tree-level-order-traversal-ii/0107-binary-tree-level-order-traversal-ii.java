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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null){
            return l; 
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int p=q.size();
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<p;i++){
                TreeNode z=q.poll();
                if(z.left!=null){
                    q.add(z.left);
                }
                if(z.right!=null){
                    q.add(z.right);
                }
                a.add(z.val);

            }
            l.add(a);
        }
        Collections.reverse(l);
        return l;
        
    }
}