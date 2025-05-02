class Solution {
    List<String> l;
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map=new HashMap<>();
        l=new ArrayList<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        
        for(int i=0;i<digits.length();i++){
            int p=digits.charAt(i)-'0';
            String q=map.get(p);
            int r=map.get(p).length();
            if(l.isEmpty()){
                for(int z=0;z<r;z++){
                    l.add(String.valueOf(q.charAt(z)));
                }

            }
            else{
                solve(q,r,map);

            }
            
        }
        return l;

        
    }
    public void solve(String q,int r,HashMap<Integer,String> map){
        List<String> x=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<l.size();j++){
                String c=l.get(j)+String.valueOf(q.charAt(i));
                x.add(c);

            }
        }
        l.clear();
        l.addAll(x);

    }
}