package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/permutation-in-string/">567. Permutation in String</a>}.
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
//        Input: s1 = "ab", s2 = "eidbaooo"
//        Output: true

        int s1Len = s1.length();
        int s2Len = s2.length();

        final String sortedS1 = sort(s1);

        for (int i = 0; i < s2Len - s1Len + 1; i++) {
            final String sortedS = sort(s2.substring(i, i + s1Len));
            if (sortedS.equals(sortedS1)) return true;
        }

        return false;
    }

    private String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    //via hashtable
    public boolean checkInclusionI(String s1, String s2) {
        // s1 = "ab", s2 = "eidbaooo"
        final Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            final String temp = s2.substring(i, i + s1.length());
            final Map<Character, Integer> map2 = new HashMap<>();
            for (int j = 0; j < temp.length(); j++) {
                char ch = temp.charAt(j);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }

            if (map2.equals(map1)) return true;

        }
        return false;
    }
}
