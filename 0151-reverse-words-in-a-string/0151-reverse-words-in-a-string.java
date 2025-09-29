class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        String[] p=s.split("\\s+");
        int i=0;
        int j=p.length-1;
        while(i<=j){
            String temp=p[i];
            p[i]=p[j];
            p[j]=temp;
            i++;
            j--;
        }
        String s1="";
        for(i=0;i<p.length;i++){
            s1=s1+p[i]+" ";
        }
        return s1.strip();
        
    }
}