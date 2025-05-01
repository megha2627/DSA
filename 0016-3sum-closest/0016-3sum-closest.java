class Solution {
    int p=Integer.MAX_VALUE;
    int u=0;
    public int threeSumClosest(int[] nums, int target) {
       
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            solve(nums,i,target);
        }
        return u;
        
    }
    public void solve(int[] nums,int i,int target){
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            if((nums[i]+nums[j]+nums[k])==target){

                u=nums[i]+nums[j]+nums[k];
                p=0;
                return;
            }
            else if((nums[i]+nums[j]+nums[k])<target){
               if(p>Math.abs((nums[i]+nums[j]+nums[k])-target)){
                u=nums[i]+nums[j]+nums[k];
                p=Math.abs((nums[i]+nums[j]+nums[k])-target);
               }
               

                j++;
            }
            else if((nums[i]+nums[j]+nums[k])>target){
               if(p>Math.abs((nums[i]+nums[j]+nums[k])-target)){
                u=nums[i]+nums[j]+nums[k];
                p=Math.abs((nums[i]+nums[j]+nums[k])-target);
               }
                k--;
            }
        }
    }
}