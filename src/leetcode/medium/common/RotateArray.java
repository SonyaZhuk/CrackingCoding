package leetcode.medium.common;

/**
 * {@link <a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a>}.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        while (k > 0) {
            for (int i = nums.length - 1; i > 0; i--) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
            k--;
        }
    }

    public void rotateI(int[] nums, int k) {
        int len = nums.length;
        int temp[] = new int[len];

        for (int i = 0; i < len; i++) {
            temp[(i + k) % len] = nums[i];
        }

        for (int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotateII(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
