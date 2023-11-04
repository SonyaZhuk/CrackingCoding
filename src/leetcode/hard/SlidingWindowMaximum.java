package leetcode.hard;

/**
 * {@link <a href="https://leetcode.com/problems/sliding-window-maximum/">239. Sliding Window Maximum</a>}.
 */
public class SlidingWindowMaximum {

    //time out
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 1 && k == 1) return new int[]{1};

        int[] temp = new int[k];

        int len = nums.length - k + 1;

        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            if (k == 1) {
                res[i] = nums[i];
            } else {
                System.arraycopy(nums, i, temp, 0, k);
                int max = Integer.MIN_VALUE;
                for (int j = 1; j < k; j++) {
                    if (temp[j - 1] > temp[j]) {
                        max = Math.max(max, temp[j - 1]);
                    } else {
                        max = Math.max(max, temp[j]);
                    }
                    res[i] = max;
                }
            }
        }

        return res;
    }
}

