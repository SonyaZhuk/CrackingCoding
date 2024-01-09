package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/valid-palindrome-ii/">680. Valid Palindrome II</a>}.
 */
public class ValidPalindromeII {

    //time out
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            if (isPalindrome(sb)) return true;
        }
        return false;
    }

    private boolean isPalindrome(StringBuilder sb) {
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) return false;
        }
        return true;
    }

    public boolean validPalindromeI(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}
