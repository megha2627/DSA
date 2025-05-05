class Solution {
    public void nextPermutation(int[] nums) {
        int k=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
               k=i-1;
                break;
            }
        }
        if(k==-1){
            reverse(0,nums);
        }
        else{

        
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]>nums[k]){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                break;
            }

        }
        reverse(k+1,nums);
        }

        
        
    }
    public void reverse(int k,int[] nums){
        int i=k;
        int j=nums.length-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}