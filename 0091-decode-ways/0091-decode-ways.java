class Solution {
    public int numDecodings(String s) {
        Integer[] dp = new Integer[s.length()];
        return solve(s, 0, "", dp);
    }

    public int solve(String s, int i, String s1, Integer[] dp) {
        // initial check for empty substring (first call)
        if (!s1.equals("")) {
            if (s1.charAt(0) == '0') return 0;
            int num = Integer.parseInt(s1);
            if (num > 26 || num <= 0) return 0;
        }

        // base case
        if (i >= s.length()) return 1;

        // DP check
        if (dp[i] != null) return dp[i];

        int take = solve(s, i + 1, s.substring(i, i + 1), dp);
        int skip = 0;
        if (i + 1 < s.length()) {
            skip = solve(s, i + 2, s.substring(i, i + 2), dp);
        }

        return dp[i] = take + skip;
    }
}
