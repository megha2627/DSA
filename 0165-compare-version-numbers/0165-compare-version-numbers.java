class Solution {
    public int compareVersion(String version1, String version2) {
        String p[]=version1.split("\\.");
        String q[]=version2.split("\\.");
        int i=0;
        int j=0;
        while(i<p.length && j<q.length){
            if(Integer.parseInt(p[i])<Integer.parseInt(q[j])){
                return -1;
            }
            else  if(Integer.parseInt(p[i])>Integer.parseInt(q[j])){
                return 1;
            }
            
            i++;
            j++;
        }
        while(i<p.length){
            
            if(Integer.parseInt(p[i])>0){
                return 1;
            }
            i++;


        }
        while(j<q.length){
           
            if(Integer.parseInt(q[j])>0){
                return -1;
            }
            j++;

        }
        return 0;
        
    }
}