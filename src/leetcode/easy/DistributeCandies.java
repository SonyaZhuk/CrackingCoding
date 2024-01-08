package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/distribute-candies/">575. Distribute Candies</a>}.
 */
public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int type : candyType) {
            set.add(type);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
    public int distributeCandiesI(int[] candyType) {
        int count = candyType.length / 2;
        int countDist = (int) Arrays.stream(candyType).distinct().count();
        return Math.min(count, countDist);
    }
}
