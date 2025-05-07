class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s=countAndSay(n-1);
        StringBuilder p=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int count=1;
            char c=s.charAt(i);
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            p.append(count).append(c);
        }
        return p.toString();
        
    }
}