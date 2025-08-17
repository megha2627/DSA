class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] nums=new int[((grid.length)*(grid.length))+1];
        int[] a=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int p=grid[i][j];
                nums[p]=nums[p]+1;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==2){
                a[0]=i;
            }
            if(nums[i]==0){
                a[1]=i;
            }
        }
        return a;
        
    }
}