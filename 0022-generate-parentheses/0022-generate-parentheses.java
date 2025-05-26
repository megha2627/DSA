class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> v=new ArrayList<>();
        if(n==0){
            return v;
        }
        v.add("()");
        for(int i=0;i<n-1;i++){
            v=solve(v);
        }
        return v;
        
    }
    public List<String> solve(List<String> v){
        List<String> a=new ArrayList<>();
        for(int i=0;i<v.size();i++){
            for(int j=0;j<v.get(i).length();j++){
               String s=v.get(i);
               String q=s.substring(0,j)+"()"+s.substring(j);
               if(!a.contains(q)){
                a.add(q);
               }
              
            }
        }
        v=a;
        return v;
    }
}