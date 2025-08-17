class Solution {
    public int singleNumber(int[] nums) {
        //we are solving this solurions using the hasmap data struture
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);

            }
            
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return -1;
    }
}