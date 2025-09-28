class Solution {
    Boolean[][] memo; // memoization table

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false; // length mismatch

        memo = new Boolean[s1.length() + 1][s2.length() + 1];
        return solve(0, 0, 0, s1, s2, s3);
    }

    private boolean solve(int i, int j, int k, String s1, String s2, String s3) {
        // Base case: sab chars use ho gaye
        if (i == s1.length() && j == s2.length() && k == s3.length()) {
            return true;
        }

        // Check memo table
        if (memo[i][j] != null) return memo[i][j];

        boolean ans = false;

        // Option 1: s1 ka char le
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            ans = ans || solve(i + 1, j, k + 1, s1, s2, s3);
        }

        // Option 2: s2 ka char le
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            ans = ans || solve(i, j + 1, k + 1, s1, s2, s3);
        }

        // Save in memo
        memo[i][j] = ans;
        return ans;
    }
}
