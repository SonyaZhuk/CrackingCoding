package leetcode.medium;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">438. Find All Anagrams in a String</a>}.
 */
public class FindAllAnagramsInAString {

    //time out
    public List<Integer> findAnagrams(String s, String p) {

        final List<Integer> res = new ArrayList<>();

        int k = p.length();

        final Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length() - k + 1; i++) {

            final String str = s.substring(i, i + k);

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (int j = 0; j < p.length(); j++) {
                char ch = p.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) - 1);
            }

            if (isAnagram(map)) res.add(i);
            map.clear();
        }
        return res;
    }

    private boolean isAnagram(Map<Character, Integer> map) {
        boolean isAnagram = true;
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            if (entry.getValue() != 0) isAnagram = false;
        }

        return isAnagram;
    }

    public List<Integer> findAnagramsI(String s, String p) {
        int lenS = s.length();
        int lenP = p.length();
        final List<Integer> res = new ArrayList<>();

        final String sortedP = sortString(p);

        for (int i = 0; i < lenS - lenP + 1; i++) {
            final String s1 = sortString(s.substring(i, i + lenP));
            if (sortedP.equals(s1)) res.add(i);
        }

        return res;
    }

    private String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
