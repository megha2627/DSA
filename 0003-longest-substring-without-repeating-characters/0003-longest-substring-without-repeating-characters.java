class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> a=new ArrayList<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!a.contains(s.charAt(i))){
                a.add(s.charAt(i));
            }
            else{
                while(a.size()>=0){
                    a.remove(0);
                    
                    if(!a.contains(s.charAt(i))){
                        a.add(s.charAt(i));
                        break;
                    }
                }
            }
            count=Math.max(count,a.size());
            
        }
        return count;
        
    }
}






























