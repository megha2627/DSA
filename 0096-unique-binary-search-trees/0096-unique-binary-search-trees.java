class Solution {
    public int numTrees(int n) {
        // dp[i][j] will store the number of BSTs from i to j
        Integer[][] dp = new Integer[n + 2][n + 2];
        return countTrees(1, n, dp);
    }

    public int countTrees(int start, int end, Integer[][] dp) {
        if (start > end) return 1;

        if (dp[start][end] != null) {
            return dp[start][end];
        }

        int total = 0;

        for (int i = start; i <= end; i++) {
            int left = countTrees(start, i - 1, dp);
            int right = countTrees(i + 1, end, dp);
            total += left * right;
        }

        dp[start][end] = total;
        return total;
    }
}
