package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/maximum-average-subarray-i/">643. Maximum Average Subarray I</a>}.
 */
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {

        if (nums.length == 1) return nums[0];

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - k + 1; i++) {
            int sum = 0;
            int j = k - 1;
            while (j >= 0) {
                sum += nums[i + j];
                j--;
            }
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }


    public double findMaxAverageI(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}
