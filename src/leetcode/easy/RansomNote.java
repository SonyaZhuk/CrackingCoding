package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/ransom-note/">383. Ransom Note</a>}.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        final Map<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!map.containsKey(ch)) return false;
            int counter = map.get(ch) - 1;
            if (counter < 0) return false;
            else map.put(ch, counter);
        }

        return true;
    }

    public boolean canConstructI(String ransomNote, String magazine) {

        int[] map = new int[26];

        for (char ch : ransomNote.toCharArray()) {
            map[ch - 'a']++;
        }

        for (char ch : magazine.toCharArray()) {
            map[ch - 'a']--;
        }

        for (int i : map) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
