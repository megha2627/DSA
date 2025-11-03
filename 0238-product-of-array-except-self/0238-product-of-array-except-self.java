class Solution {
    int[] answer;
    int p;
    public int[] productExceptSelf(int[] nums) {
        p=0;
        answer=new int[nums.length];
        Arrays.fill(answer,0);
        solve(nums,0,1);
        
        return answer;
        
    }
    public int solve(int[] nums,int i,int s){
        if(i>=nums.length){
            return 1;
        }
        int right=solve(nums,i+1,s*nums[i]);
        
        answer[i]=s*right;
        return nums[i]*right;
        

    }
}