class Solution {
    List<List<Integer>> a;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        a=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        solve(candidates,target,0,curr,0);
        return a;
    }
    public void solve(int[] candidates,int target,int i,List<Integer> curr,int val){
        if(i>=candidates.length){
            return;
        }
        if(val>target){
            return;
        }
        if(val==target){
            
            a.add(new ArrayList<>(curr));
            return;


            
            
        }
        curr.add(candidates[i]);
        solve(candidates,target,i,curr,val+candidates[i]);
        curr.remove(curr.size()-1);
        solve(candidates,target,i+1,curr,val);
        
    }
}