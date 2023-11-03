package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a>}.
 */
public class ValidAnagram {

    //brute force
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        return sortString(s).equals(sortString(t));
    }

    private String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public boolean isAnagramI(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public boolean isAnagramII(String s, String t) {
        if (s.length() != t.length()) return false;

        final Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int i : map.values()) {
            if (i != 0) return false;
        }

        return true;
    }
}
