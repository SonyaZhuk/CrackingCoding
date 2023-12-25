package leetcode.hard;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">4. Median of Two Sorted Arrays</a>}.
 */
public class MedianOfTwoSortedArrays {

    //O(NlogN) time, O(N + M) memory.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] arr = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            arr[i] = nums1[i];
        }

        System.arraycopy(nums2, 0, arr, size1, size2);
        Arrays.sort(arr);

        return countMedian(arr);
    }

    //O(N + M) time, O(N + M) memory.
    public double findMedianSortedArraysI(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] arr = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (nums1[i] < nums2[j]) arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        }

        if(i < size1) {
            while (i < size1) {
                arr[k++] = nums1[i++];
            }
        }

        if(j < size2) {
            while (j < size2) {
                arr[k++] = nums2[j++];
            }
        }

        return countMedian(arr);
    }

    private double countMedian(int[] arr) {
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
