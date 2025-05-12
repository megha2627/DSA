class Solution {
   
     public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m+1][n+1];
        for(int[] p:dp){
            Arrays.fill(p,-1);
        }
        return solve(0,0,m,n,dp,grid);
        
    }
    public int solve(int i,int j,int m,int n,int[][] dp,int[][] grid){
        
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
       
        if(i>=m || j>=n || i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solve(i,j+1,m,n,dp,grid);
        int left=solve(i+1,j,m,n,dp,grid);
        dp[i][j]=grid[i][j]+Math.min(right,left);
        return dp[i][j];
    }
}