class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
HashMap<Character, Character> mapRev = new HashMap<>();

for(int i = 0; i < s.length(); i++){
    char c1 = s.charAt(i);
    char c2 = t.charAt(i);
    
    // Forward mapping: s -> t
    if(map.containsKey(c1)){
        if(c2 != map.get(c1)) return false;
    } else {
        map.put(c1, c2);
    }
    
    // Reverse mapping: t -> s
    if(mapRev.containsKey(c2)){
        if(c1 != mapRev.get(c2)) return false;
    } else {
        mapRev.put(c2, c1);
    }
}

return true;

    }
}