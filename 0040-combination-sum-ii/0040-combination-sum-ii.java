class Solution {
    List<List<Integer>> l = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort to handle duplicates
        List<Integer> a = new ArrayList<>();
        solve(candidates, 0, a, 0, target);
        return l;
    }

    public void solve(int[] candidates, int i, List<Integer> a, int sum, int target) {
        if (sum == target) {
            l.add(new ArrayList<>(a));
            return;
        }

        if (i >= candidates.length || sum > target) {
            return;
        }

        // Include current element
        a.add(candidates[i]);
        solve(candidates, i + 1, a, sum + candidates[i], target);
        a.remove(a.size() - 1); // backtrack

        // Skip duplicates
        int j = i + 1;
        while (j < candidates.length && candidates[j] == candidates[i]) {
            j++;
        }

        // Exclude current element and move to next distinct number
        solve(candidates, j, a, sum, target);
    }
}
