class Solution {
    
    
     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m+1][n+1];
        for(int[] p:dp){
            Arrays.fill(p,-1);
        }
        return solve(0,0,m,n,dp,obstacleGrid);
        
    }
    public int solve(int i,int j,int m,int n,int[][] dp,int[][] obstacleGrid){
         if(i==m-1 && j==n-1 && obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
       
        if(i>=m || j>=n || i<0 || j<0 || obstacleGrid[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solve(i,j+1,m,n,dp,obstacleGrid);
        int left=solve(i+1,j,m,n,dp,obstacleGrid);
        dp[i][j]=left+right;
        return dp[i][j];
    }

}