class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      
        List<Integer> a=new ArrayList<>();
        int[][] dp=new int[candidates.length+1][target+1];
       
     solve(candidates,0,a,0,target,dp);
        return l;
        
    }
    public void solve(int[] candidates,int i,List<Integer> a,int sum,int target,int[][] dp){
        if(i>=candidates.length){
            return;
        }
        if(sum==target){
            l.add(new ArrayList<>(a));
            return;
        }
        if(sum>target){
            return;
        }
       a.add(candidates[i]);
        solve(candidates,i,a,sum+candidates[i],target,dp);
        int k=a.size();
        a.remove(k-1);

        
        
        solve(candidates,i+1,a,sum,target,dp);
        
    }

    
}