package leetcode.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/**
 * {@link <a href="https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/">1941. Check if All Characters Have Equal Number of Occurrences</a>}.
 */
public class CheckAllCharactersHaveEqualNumberOccurrences {

    //"abacbc"
    public boolean areOccurrencesEqual(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : arr) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            map.putIfAbsent(c, 1);
        }

        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == 1;
    }
}
