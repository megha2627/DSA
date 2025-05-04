class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    a1.add(i);
                    a2.add(j);
                }

            }
        }
        for(int i=0;i<a1.size();i++){
            for(int j=0;j<matrix[0].length;j++){
                int k=a1.get(i);
                matrix[k][j]=0;
            }
            for(int j1=0;j1<matrix.length;j1++){
                int k1=a2.get(i);
                matrix[j1][k1]=0;
            }
        }
        
    }
}