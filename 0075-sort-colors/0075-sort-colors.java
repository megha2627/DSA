import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
       //Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
            int p=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[p]>nums[j]){
                    p=j;
                }

            }
            int temp=nums[p];
            nums[p]=nums[i];
            nums[i]=temp;
       
        }
        
    }
}