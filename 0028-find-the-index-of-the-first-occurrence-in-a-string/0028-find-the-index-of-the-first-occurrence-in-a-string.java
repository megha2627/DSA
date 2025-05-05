class Solution {
    public int strStr(String haystack, String needle) {
        int p=-1;
        if(haystack.contains(needle)){
             p=haystack.indexOf(needle);
        }
        return p;
        
    }
}