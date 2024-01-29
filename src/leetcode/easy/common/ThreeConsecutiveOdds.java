package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/three-consecutive-odds/>1550. Three Consecutive Odds</a>}.
 */
public class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                if (++count == 3) return true;
            } else count = 0;
        }

        return count == 3;
    }
}