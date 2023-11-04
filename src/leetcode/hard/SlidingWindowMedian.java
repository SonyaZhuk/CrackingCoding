package leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/sliding-window-median/">480. Sliding Window Median</a>}.
 */
public class SlidingWindowMedian {

    //time out
    public double[] medianSlidingWindow(int[] nums, int k) {
        final List<Double> medians = new ArrayList<>();

        for (int i = 0; i < nums.length - k + 1; i++) {
            int[] temp = new int[k];
            int j = 0;

            while (j <= k - 1) {
                temp[j] = nums[i + j];
                j++;
            }

            medians.add(countMedian(temp));
        }

        double[] res = new double[medians.size()];

        for (int i = 0; i < medians.size(); i++) {
            res[i] = medians.get(i);
        }

        return res;
    }
    private double countMedian(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;

        if (len % 2 == 1) {
            return arr[Math.round(len / 2)];
        } else {
            int start = len / 2 - 1;
            int end = len / 2;
            double sum = (double) arr[start] + (double) arr[end];
            return sum / 2;
        }
    }
}
