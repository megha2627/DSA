class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        ArrayList<Character> a=new ArrayList<>();
        int r=0;
        int l=0;
        while(r<s.length()){
            while(a.contains(s.charAt(r))){
                a.remove(0);
                l++;

                
                
            }
            a.add(s.charAt(r));
            maxLen=Math.max(maxLen,a.size());
            r++;
        }
        return maxLen;
        
    }
}