package leetcode.easy;


/**
 * {@link <a href="https://leetcode.com/problems/third-maximum-number/">414. Third Maximum Number</a>}.
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max) {
                max2 = Math.max(max2, nums[i]);
            }
        }
        int max3 = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != max2) {
                max3 = Math.max(max3, nums[i]);
                flag = true;
            }
        }

        return max3 >= Integer.MIN_VALUE && flag ? max3 : max;
    }

    public int thirdMaxI(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max3 = max2;
                max2 = num;
            } else if (num > max3 && num < max2) {
                max3 = num;
            }
        }

        if (max3 != Long.MIN_VALUE) {
            return (int) max3;
        }

        return (int) max1;
    }
}
