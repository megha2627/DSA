class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer,String> map=new HashMap<>();
        List<String> l1=new ArrayList<>();
        l1.add("");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        if(digits.length()==0){
            return new ArrayList<String>();
        }
        for(int i=0;i<digits.length();i++){
           String p=map.get(digits.charAt(i)-'0');
            ArrayList<String> v=new ArrayList<>();
            l1=solve(p,l1,v);
        }
        return l1;
            
    }
    public List<String> solve(String p,List<String> l1,List<String> v){
       
        for(int i=0;i<p.length();i++){
           
            for(int j=0;j<l1.size();j++){
                v.add(l1.get(j)+String.valueOf(p.charAt(i)));
            }
        }
        return v;
    }
}