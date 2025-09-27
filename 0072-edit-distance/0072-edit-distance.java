class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        Integer[][] dp = new Integer[m][n]; // memoization table
        return solve(word1, word2, 0, 0, dp);
    }

    private int solve(String s1, String s2, int i, int j, Integer[][] dp) {
        if (i >= s1.length()) {
            return s2.length() - j; // insert remaining chars of s2
        }
        if (j >= s2.length()) {
            return s1.length() - i; // delete remaining chars of s1
        }
        if (dp[i][j] != null) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            // chars match → no operation
            return dp[i][j] = solve(s1, s2, i + 1, j + 1, dp);
        }

        // Case 1: Insert (move j forward)
        int insert = 1 + solve(s1, s2, i, j + 1, dp);
        // Case 2: Delete (move i forward)
        int delete = 1 + solve(s1, s2, i + 1, j, dp);
        // Case 3: Replace (move both forward)
        int replace = 1 + solve(s1, s2, i + 1, j + 1, dp);

        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }
}
