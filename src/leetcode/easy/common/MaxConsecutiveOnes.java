package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/max-consecutive-ones/">485. Max Consecutive Ones</a>}.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 0 && counter != 0) {
                max = Math.max(max, counter);
                counter = 0;
            } else if (num == 1) counter++;
        }
        return Math.max(max, counter);
    }

    public int findMaxConsecutiveOnesI(int[] nums) {
        int l = 0, r = 0, max = 0;

        while (r < nums.length) {
            while (r < nums.length && nums[r] == 1) {
                ++r;
            }
            max = Math.max(max, r - l);
            ++r;
            l = r;
        }
        return max;
    }
}
