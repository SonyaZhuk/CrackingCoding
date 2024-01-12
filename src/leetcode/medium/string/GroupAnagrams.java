package leetcode.medium.string;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/group-anagrams/">49. Group Anagrams</a>}.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        final Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            final String sortedStr = new String(arr);

            map.putIfAbsent(sortedStr, new ArrayList<>());
            if (map.containsKey(sortedStr)) map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
