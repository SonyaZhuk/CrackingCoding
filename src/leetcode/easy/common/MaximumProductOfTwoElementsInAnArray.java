package leetcode.easy.common;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/>1464. Maximum Product of Two Elements in an Array</a>}.
 */
public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }

    public int maxProductI(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max1 = nums[i];
                index = i;
            }
        }

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max2 && i != index) {
                max2 = nums[i];
            }
        }

        return (max1 - 1) * (max2 - 1);
    }

    public int maxProductII(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}