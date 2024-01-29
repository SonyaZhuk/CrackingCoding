package leetcode.easy.common;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/kth-missing-positive-number/>1539. Kth Missing Positive Number</a>}.
 */
public class KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
            set.add(a);
        }

        int len = arr[arr.length - 1];
        int count = 0;
        for (int i = 1; i <= len; i++) {
            if (!set.contains(i)) {
                count++;
                if (count == k) return i;
            }
        }

        while (count != k) {
            len++;
            count++;
        }

        return len;
    }

    public int findKthPositiveI(int[] arr, int k) {
        for (int i : arr) {
            if (i <= k) k++;
            else break;
        }
        return k;
    }
}
