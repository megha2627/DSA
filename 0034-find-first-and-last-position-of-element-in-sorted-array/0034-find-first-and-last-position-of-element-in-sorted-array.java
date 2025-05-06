class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        int k=-1;
        while(low<=high){
            mid=low+((high-low)/2);
            if(nums[mid]==target){
                k=mid;
                break;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            

        }
        if(k==-1){
            return new int[]{-1,-1};
        }
        int start=k;
        int end=k;
        while(end<nums.length){
           
            if(nums[end]==target){
                end++;

            }
            else{
                break;
            }
            
           

            
        }
         while(start>=0){
            if(nums[start]==target){
                 start--;

            }
            else{
                break;
            }

           
            
           
            
        }
        return new int[]{start+1,end-1};
        
    }
}