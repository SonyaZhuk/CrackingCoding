package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a>}.
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
