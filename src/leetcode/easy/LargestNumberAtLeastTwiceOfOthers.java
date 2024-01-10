package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/largest-number-at-least-twice-of-others/">747. Largest Number At Least Twice of Others</a>}.
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[index]) index = i;
        }

        int maxNum = nums[index];
        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] * 2 > maxNum) return -1;
        }

        return index;
    }

    public int dominantIndexI(int[] nums) {
        int index = 0;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }

        return first >= 2 * second ? index : -1;
    }
}
