package leetcode.easy.string;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/positions-of-large-groups/">830. Positions of Large Groups</a>}.
 */
public class PositionsOfLargeGroups {

    public List<List<Integer>> largeGroupPositions(String s) {

        final List<List<Integer>> res = new ArrayList<>();
        int c = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                c++;
            }

            if (s.charAt(i) != s.charAt(i - 1)) {
                if (c > 2) res.add(List.of(i - c, i - 1));
                c = 1;
            }
        }
        if (c > 2) res.add(List.of(s.length() - c, s.length() - 1));
        return res;
    }
}
