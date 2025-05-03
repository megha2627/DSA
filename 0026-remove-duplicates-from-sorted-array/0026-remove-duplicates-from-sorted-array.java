class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new HashSet<>();
       List<Integer> s1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                s1.add(nums[i]);
            }
            else{
                //s1.add(nums[i]);
            }
        }
        
        
        //s2.addAll(s1);
        int i=0;
        for(int v:s1){
            nums[i]=v;
            i++;
        }
        
        return s.size();
        
    }
}