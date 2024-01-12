package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/sort-array-by-parity/">905. Sort Array By Parity</a>}.
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        // [3,1,2,4]
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        return nums;
    }
}
