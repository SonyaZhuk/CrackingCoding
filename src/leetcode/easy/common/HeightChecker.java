package leetcode.easy.common;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/height-checker/">1051. Height Checker</a>}.
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] sortedHeights = new int[len];
        System.arraycopy(heights, 0, sortedHeights, 0, len);
        Arrays.sort(sortedHeights);

        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) counter++;
        }

        return counter;
    }
}
