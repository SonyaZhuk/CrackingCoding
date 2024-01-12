package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/palindrome-number/">9. Palindrome Number</a>}.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        final String s = Integer.toString(x);

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }

        return true;
    }
    public boolean isPalindromeI(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return (x == rev || x == rev / 10);
    }
}
