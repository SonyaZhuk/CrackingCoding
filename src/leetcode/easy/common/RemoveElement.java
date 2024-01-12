package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>}.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
