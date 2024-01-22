package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/running-sum-of-1d-array/>1480. Running Sum of 1d Array</a>}.
 */
public class RunningSumOfFdArray {

    public int[] runningSum(int[] nums) {
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}