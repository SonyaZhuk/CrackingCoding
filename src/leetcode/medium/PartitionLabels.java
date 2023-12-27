package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/partition-labels/">763. Partition Labels</a>}.
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        final List<Integer> results = new ArrayList<>();
        final Map<Character, Integer> characters = new HashMap<>();
        int max = 0;
        int gap = -1;

        for (int i = 0; i < s.length(); i++) {
            characters.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, characters.get(s.charAt(i)));

            if (max == i) {
                results.add(max - gap);
                gap = max;
            }
        }
        return results;
    }

    public List<Integer> partitionLabelsI(String s) {
        int a = 0;
        int b = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(s.charAt(i)) > a) {
                a = s.lastIndexOf(s.charAt(i));
            }
            if (i == a) {
                result.add(a + 1 - b);
                b = a + 1;
                a = i;
            }
        }
        return result;
    }
}
