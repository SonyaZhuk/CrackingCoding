package leetcode.medium;

/**
 * {@link <a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a>}.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int square = 0;
        int h = 0;

        while (left < right) {
            h = Math.min(height[left], height[right]);
            square = Math.max(square, h * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return square;
    }
}
