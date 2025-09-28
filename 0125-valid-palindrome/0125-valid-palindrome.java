class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase
        String str = s.toLowerCase();
        StringBuilder v = new StringBuilder();

        // Keep only letters and digits
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
                (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                v.append(str.charAt(i));
            }
        }

        // Check palindrome
        String q = v.toString();
        int i = 0;
        int j = q.length() - 1;
        while (i <= j) {
            if (q.charAt(i) != q.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
