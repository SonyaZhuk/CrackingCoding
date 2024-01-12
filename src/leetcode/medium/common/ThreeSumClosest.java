package leetcode.medium.common;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/3sum-closest/">16. 3Sum Closest</a>}.
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(ans)) {
                    ans = target - sum;
                }

                if (sum > target) end--;
                else start++;
            }
        }
        return target - ans;
    }
}
