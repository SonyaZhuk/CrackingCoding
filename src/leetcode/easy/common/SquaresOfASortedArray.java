package leetcode.easy.common;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>}.
 */
public class SquaresOfASortedArray {

    //brute force O(NlogN)
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    //O(N)
    public int[] sortedSquaresI(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        int i = 0;
        int j = len - 1;

        for (int k = len - 1; k >= 0 ; k--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}
