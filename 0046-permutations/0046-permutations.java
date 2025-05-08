import java.util.*;

class Solution {
    List<List<Integer>> a;

    public List<List<Integer>> permute(int[] nums) {
        a = new ArrayList<>();
        Arrays.sort(nums); // Start from the smallest lex permutation
        a.add(toList(nums));

        while (permutation(nums)) {
            a.add(toList(nums));
        }

        return a;
    }

    public boolean permutation(int[] nums) {
        int k = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }

        if (k == -1) return false; // No more permutations

        for (int j = nums.length - 1; j > k; j--) {
            if (nums[j] > nums[k]) {
                swap(nums, j, k);
                break;
            }
        }

        reverse(nums, k + 1);
        return true;
    }

    void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<Integer> toList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }
}
