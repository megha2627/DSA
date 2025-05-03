class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> a=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                a.add(nums[i]);
               
            }
        }
        int i=0;
        for(int v:a){
            nums[i++]=v;
        }
        return a.size();
        
    }
}