class Solution {
    public int majorityElement(int[] nums) {
        int k=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int c=1;
            while(i+1<nums.length && nums[i]==nums[i+1]){
                c++;
                i++;
            }
            if(c>k/2){
                return nums[i];
            }
        }
        return -1;
        
    }
}