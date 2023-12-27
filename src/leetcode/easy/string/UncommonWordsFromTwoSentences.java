package leetcode.easy.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/uncommon-words-from-two-sentences/">884. Uncommon Words from Two Sentences</a>}.
 */
public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        StringBuilder builder = new StringBuilder(s1);
        builder.append(" ").append(s2);

        String[] arr = builder.toString().split("\\s");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            map.putIfAbsent(s, 1);
        }

        List<String> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                res.add(key);
            }
        }

        return res.toArray(new String[res.size()]);
    }
}
