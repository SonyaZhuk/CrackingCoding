package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/find-pivot-index/">724. Find Pivot Index</a>}.
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < len; j++) {
                if (j < i) {
                    sum1 += nums[j];
                } else if (j > i) {
                    sum2 += nums[j];
                }
            }
            if (sum1 == sum2) return i;
        }
        return -1;
    }

    public int pivotIndexI(int[] nums) {
        if (nums.length == 0) return -1;

        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
