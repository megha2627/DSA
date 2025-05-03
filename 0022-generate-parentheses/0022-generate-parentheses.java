import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> generateParenthesis(int n) {
        // List to store StringBuilder combinations
        List<StringBuilder> l = new ArrayList<>();
        // List to store final String result
        List<String> l2 = new ArrayList<>();
        
        // Base case: if n == 0, return an empty list
        if (n == 0) {
            return l2;
        }

        // Initialize the list with the first combination "()" 
        l.add(new StringBuilder("()"));

        // Iterate n-1 times to generate combinations
        for (int i = 1; i < n; i++) {
            solve(i, l);
        }

        // Use a HashSet to eliminate duplicates
        Set<String> uniqueCombinations = new HashSet<>();
        for (StringBuilder sb : l) {
            uniqueCombinations.add(sb.toString());
        }

        // Add unique combinations to the result list
        l2.addAll(uniqueCombinations);
        
        return l2;
    }

    // Helper method to generate combinations
    public void solve(int i, List<StringBuilder> l) {
        List<StringBuilder> l1 = new ArrayList<>();
        
        // Iterate through each existing combination in the list
        for (StringBuilder sb : l) {
            StringBuilder p = new StringBuilder(sb); // Create a copy of the current StringBuilder
            
            // Generate new combinations by adding parentheses in different positions
            p.append("()"); // This creates a new pair of parentheses for the current combination
            l1.add(p);
            
            // Add opening and closing parentheses in all possible positions
            for (int j = 0; j < sb.length(); j++) {
                StringBuilder newSb = new StringBuilder(sb);
                newSb.insert(j, '(');
                newSb.insert(j + 1, ')');
                l1.add(newSb);
            }
        }
        
        // Update the list with the newly generated combinations
        l.clear();
        l.addAll(l1);
    }
}
