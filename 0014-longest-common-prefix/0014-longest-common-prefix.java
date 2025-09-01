class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       
        String str="";
        for(int i=0;i<strs[0].length();i++){
            char h=strs[0].charAt(i);
            
            for(int j=0;j<strs.length;j++){
                char h1=strs[j].charAt(i);
                if(h1!=h){
                   return str;
                }
            }
            str=str+h;
           
            
        }
        return str;
        
    }
}