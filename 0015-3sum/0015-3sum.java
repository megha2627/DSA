class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to apply two-pointer technique

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicates for j and k
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                } else if (sum < 0) {
                      // Skip duplicates for j and k
                    
                    j++; // Need a larger number
                } else {
                      // Skip duplicates for j and k
                   
                    k--; // Need a smaller number
                }
            }
        }

        return res;
    }
}
