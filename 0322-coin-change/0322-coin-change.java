class Solution {
    int count;
    int total;
    public int coinChange(int[] coins, int amount) {
        count=0;
        int[][] dp=new int[coins.length+1][amount+1];
        total=Integer.MAX_VALUE;
        for(int[] p:dp){
            Arrays.fill(p,-1);
        }
        int ans=solve(dp,coins,amount,count,0);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
    public int solve(int[][] dp,int[] coins,int amount,int count,int i){
        if(amount==0){
           return 0;
        }
        if(i>=coins.length || amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        
        int take=solve(dp,coins,amount-coins[i],count+1,i);
        if(take!=Integer.MAX_VALUE){
            take=take+1;
        }
        int skip=solve(dp,coins,amount,count,i+1);
        dp[i][amount]=Math.min(take,skip);
        return dp[i][amount];
    }
}