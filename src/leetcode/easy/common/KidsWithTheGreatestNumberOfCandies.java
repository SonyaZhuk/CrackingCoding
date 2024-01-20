package leetcode.easy.common;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/>1431. Kids With the Greatest Number of Candies</a>}.
 */
public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        final List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            boolean isGreatest = candies[i] + extraCandies >= max;
            res.add(isGreatest);
        }

        return res;
    }
}
