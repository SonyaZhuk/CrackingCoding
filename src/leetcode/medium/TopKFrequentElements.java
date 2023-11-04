package leetcode.medium;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/top-k-frequent-elements/">347. Top K Frequent Elements</a>}.
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        final Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 1) + 1);
        }

        final List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (n1, n2) -> map.get(n2).compareTo(map.get(n1)));

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
