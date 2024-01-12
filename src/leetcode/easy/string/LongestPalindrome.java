package leetcode.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/longest-palindrome/">409. Longest Palindrome</a>}.
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {

        if (s == null || s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();

        int counter = 0;

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                counter++;
            } else {
                set.add(ch);
            }
        }
        counter = counter * 2;

        return !set.isEmpty() ? counter + 1 : counter;
    }

    public int longestPalindromeI(String s) {
        int[] freq = new int[256];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        boolean isOne = false;
        int len = 0;
        for (int num : freq) {
            if (num % 2 == 0)
                len += num;
            else {
                len += num - 1;
                isOne = true;
            }
        }
        return isOne ? len + 1 : len;
    }
}
