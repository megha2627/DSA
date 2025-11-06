class Solution {
    int[][] dp;
    List<Integer> a;
    public int lengthOfLIS(int[] nums) {
       
        dp=new int[nums.length][nums.length+1];
        for(int[] p:dp){
            Arrays.fill(p,-1);
        }
        return solve(dp,nums,0,-1);
    }

        
    public int solve(int[][] dp,int[] nums,int i,int p){
        if(i>=nums.length){
            return 0;
        }
        if(p!=-1 && dp[i][p+1]!=-1){
            return dp[i][p+1];
        }
        int take=0;
        if(p==-1 || nums[i]>nums[p]){
            take=1+solve(dp,nums,i+1,i);
           

        
        }
        int skip=solve(dp,nums,i+1,p);
        
            dp[i][p+1]=Math.max(take,skip);

        
       
       return dp[i][p+1];
    }
}