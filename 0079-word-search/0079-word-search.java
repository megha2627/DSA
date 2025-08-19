class Solution {
    int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
    int l,m,n;
    public boolean exist(char[][] board, String word) {
        l=word.length();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && solve(board,i,j,0,word)){
                    return true;
                }
            }
        }return false;
       
        
    }
    public boolean solve(char[][] board,int i,int j,int idx,String word){
        if(idx>=l){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='$';
        for(int[] dir:directions){
            int i1=dir[0]+i;
            int j1=dir[1]+j;
            
            if(solve(board,i1,j1,idx+1,word)){
                return true;
            }
        }
        board[i][j]=temp;
        return false;
    }
}