class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        // Outer loop: choose starting index
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            // Inner loop: choose ending index
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];  // sum of subarray nums[i..j]
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
