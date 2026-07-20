class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left <= right) {
            if (!isAlphaNumeric(s.charAt(left))) {
                left++;
            } else if (!isAlphaNumeric(s.charAt(right))) {
                right--;
            } else if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char ch) {
        return (ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122);
    }
}
