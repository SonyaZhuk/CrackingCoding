package leetcode.medium;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/sort-colors/">75. Sort Colors</a>}.
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;

        for (int num: nums) {
            if (num == 0) red++;
            else if(num == 1) white++;
        }

        Arrays.fill(nums, 0, red, 0);
        Arrays.fill(nums, red, red + white, 1);
        Arrays.fill(nums, red + white, nums.length, 2);
    }

    public void sortColorsI(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                swap(nums, left, right);
                left++;
            }
        }

        for (int i = left; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(nums, left, i);
                left++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}