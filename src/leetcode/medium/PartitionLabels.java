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
}
