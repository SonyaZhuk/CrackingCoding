package leetcode.easy.common;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/>1502. Can Make Arithmetic Progression From Sequence</a>}.
 */
public class CanMakeArithmeticProgressionFromSequence {

    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) return false;
        }

        return true;
    }
}
