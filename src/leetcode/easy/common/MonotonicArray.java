package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/monotonic-array/">896. Monotonic Array</a>}.
 */
public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        int countDec = 1;
        int countInc = 1;

        for (int i = 1; i < len; i++) {
            if (nums[i] >= nums[i - 1]) countInc++;
            if (nums[i] <= nums[i - 1]) countDec++;
        }
        return countInc == len || countDec == len;
    }

    public boolean isMonotonicI(int[] nums) {
        int len = nums.length;
        boolean isInc = true;
        boolean isDec = true;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) isInc = false;
            else if (nums[i] < nums[i - 1]) isDec = false;
        }
        return (isInc || isDec);
    }

    public boolean isMonotonicII(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) return false;
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) return false;
            }
        }
        return true;
    }
}