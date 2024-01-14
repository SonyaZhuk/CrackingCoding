package leetcode.easy.common;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/unique-number-of-occurrences/">1207. Unique Number of Occurrences</a>}.
 */
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        final Set<Integer> freq = new HashSet<>(map.values());
        return map.size() == freq.size();
    }

    public boolean uniqueOccurrencesI(int[] arr) {
        final Set<Integer> freq = new HashSet<>();
        Arrays.sort(arr);

        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) counter++;
            else {

                if ((i == arr.length - 1 && freq.contains(1)) || (freq.isEmpty() && arr.length == 2) ||
                        !freq.isEmpty() && freq.contains(counter)) return false;

                freq.add(counter);
                counter = 1;
            }
        }

        return true;
    }
}
