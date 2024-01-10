package leetcode.easy.string;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/most-common-word/">819. Most Common Word</a>}.
 */
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        final String[] paragraphArr = paragraph.toLowerCase()
                .replaceAll("\\W+", " ").split("\\s+");

        Set<String> bannedSet = new HashSet<>();
        Collections.addAll(bannedSet, banned);

        final Map<String, Integer> map = new HashMap<>();
        for (String word : paragraphArr) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int max = 0;
        String ans = "";
        for (int i = 0; i < paragraphArr.length; i++) {
            final String word = paragraphArr[i];
            if (!bannedSet.contains(word) && map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }
        return ans;
    }
}
