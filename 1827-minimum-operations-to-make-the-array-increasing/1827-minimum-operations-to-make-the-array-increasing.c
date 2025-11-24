

int minOperations(int* nums, int numsSize){
    int count=0;
    for(int i=0;i<numsSize;i++){
        if(i==0){
            continue;
        }
        else if(nums[i-1]==nums[i]){
            nums[i]=nums[i]+1;
            count++;
        }
        else if(nums[i-1]>nums[i]){
            int p=nums[i-1]-nums[i];
            p=p+1;
            nums[i]=nums[i]+p;
            count=count+p;
        }
    }
    return count;

}