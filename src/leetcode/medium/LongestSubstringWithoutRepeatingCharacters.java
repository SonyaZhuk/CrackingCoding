package leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>}.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        //"abcabcbb"
        if (s == null) return -1;
        if (s.length() == 0) return 0;

        final Set<Character> set = new HashSet<>();
        int res = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            set.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (set.contains(ch)) {
                    set.clear();
                    break;
                }
                set.add(ch);
                res = Math.max(res, set.size());
            }
        }
        return res;
    }

    public int lengthOfLongestSubstringI(String s) {
        final Map<Character, Integer> map = new HashMap();
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public int lengthOfLongestSubstringII(String s) {
        if (s == null || s.length() == 0) return 0;

        final Set<Character> set = new HashSet<>();
        int j = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            while (!set.add(s.charAt(i))) {
                set.remove(s.charAt(j++));
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
