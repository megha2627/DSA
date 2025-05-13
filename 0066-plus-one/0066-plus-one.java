class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Go from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, add 1 and return early
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Else make it 0 and continue loop (carry)
            digits[i] = 0;
        }
        
        // If all were 9, then return new array with 1 at front and rest 0
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
