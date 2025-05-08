/*class Solution {
     int min=Integer.MAX_VALUE;
    public int jump(int[] nums) {
        int val=0;
       
        solve(nums,val,0);
        return min;
        
    }
    public void solve(int[] nums,int val,int i){
        if(i==nums.length-1){
            min=Math.min(min,val);
            return;
        }
        if(i>nums.length-1){
            return;
        }
        for(int j=1;j<=nums[i];j++){
            solve(nums,val+1,j+i);
        }
    }
}*/

class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
