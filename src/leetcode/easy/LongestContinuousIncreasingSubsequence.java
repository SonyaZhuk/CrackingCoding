package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/longest-continuous-increasing-subsequence/">674. Longest Continuous Increasing Subsequence</a>}.
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int len = 1;
        int maxLen = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                maxLen = Math.max(maxLen, len);
                len = 1;
            }

        }
        return Math.max(maxLen, len);
    }
}
