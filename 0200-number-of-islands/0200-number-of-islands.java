class Solution {
    int count;
    int[][] directions;
    public int numIslands(char[][] grid) {
        directions=new int[][] {{0,1},{1,0},{-1,0},{0,-1}};
        count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' ){
                    solve(grid,i,j);
                    count++;
                }
                
            }
        }
        return count;
        
    }
    public void solve(char[][] grid,int i,int j){
        if(i<0  || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
         grid[i][j]='0';

        for(int[] dir:directions){
            int i1=dir[0];
            int j1=dir[1];
            solve(grid,i+i1,j+j1);
                
            
        }
       
        
    } 
}