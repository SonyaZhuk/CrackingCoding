package leetcode.easy.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/string-matching-in-an-array/>1408. String Matching in an Array</a>}.
 */
public class StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].length() < words[j].length()) {
                    if (words[j].contains(words[i])) res.add(words[i]);
                }
            }
        }
        return new ArrayList<>(res);
    }

    public List<String> stringMatchingI(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;
                if (words[j].indexOf(s) >= 0) {
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
}
