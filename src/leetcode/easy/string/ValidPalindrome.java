package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>}.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        final String s1 = s.toLowerCase().replaceAll("[^a-z\\d]", "");

        if (s1.length() < 2) return true;

        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) return false;
        }
        return true;
    }

    public boolean isPalindromeI(String s) {
        if (s.isEmpty()) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
