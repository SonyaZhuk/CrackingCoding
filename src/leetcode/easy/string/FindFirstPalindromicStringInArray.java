package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/find-first-palindromic-string-in-the-array/">2108. Find First Palindromic String in the Array</a>}.
 */
public class FindFirstPalindromicStringInArray {

    public String firstPalindrome(String[] words) {

        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return word;
        }
        return "";
    }
}
