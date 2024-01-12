package leetcode.medium.string;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/top-k-frequent-words/">692. Top K Frequent Words</a>}.
 */
public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {

        final Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 1) + 1);
        }

        final List<String> res = new ArrayList<>(map.keySet());

        Collections.sort(res, (e1, e2) -> map.get(e1).equals(map.get(e2)) ?
                e1.compareTo(e2) : map.get(e2) - map.get(e1));

        return res.subList(0, k);
    }
}
