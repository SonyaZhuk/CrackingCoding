package leetcode.medium.string;

/**
 * {@link <a href="https://leetcode.com/problems/palindromic-substrings/">647. Palindromic Substrings</a>}.
 */
public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int res = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length() - i; j++) {
                String s1 = s.substring(i, i + j + 1);
                if (isPalindrom(s1)) res++;
            }
        }
        return res;
    }

    private boolean isPalindrom(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char t = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = t;
        }
        return s.equals(new String(arr));
    }
}
