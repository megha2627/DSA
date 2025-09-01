class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0 || s.length()==1 || s.length()==numRows){
            return s;
        }
        String[] s1=new String[numRows];
        Arrays.fill(s1,"");
        int i=0;
        while(i<s.length()){
            int j=0;
            while(j<numRows && i<s.length()){
                s1[j]=s1[j]+s.charAt(i);
                j++;
                i++;
            }
            int p=numRows-2;
            while(p>0 && i<s.length()){
                s1[p]=s1[p]+s.charAt(i);
                i++;
                p--;
            }
        }
        String q="";
        for(i=0;i<s1.length;i++){
            q=q+s1[i];
        }
        return q;
        
    }
}