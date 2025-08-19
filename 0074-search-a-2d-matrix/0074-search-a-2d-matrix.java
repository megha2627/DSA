class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        Boolean is=false;
        int v=-1;
        for(int i=0;i<m;i++){
            
            if(target<=matrix[i][n-1] && target>=matrix[i][0]){
                for(int j=0;j<n;j++){
                    if(target==matrix[i][j]){
                         is=true;
                         break;
                    }

                }
           
            }
                
            
           
        }
        
        return is;
        
    }
}