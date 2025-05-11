class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] p=s.trim().split("\\s+");
        int q=p.length-1;
        int p1=p[q].length();
        return p1;
         
        
    }
}