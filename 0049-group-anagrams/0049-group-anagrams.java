import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String str : strs) {
            // Create a sorted version of the string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            // Group by sorted string (key)
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(str);
        }

        // Return the grouped anagrams as a List of Lists
        return new ArrayList<>(anagramMap.values());
    }
}
