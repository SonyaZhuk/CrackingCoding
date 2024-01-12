package leetcode.medium.common;


/**
 * {@link <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>}.
 */
public class MaximumSubarray {

    //Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < len; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }

        return max;
    }
}
