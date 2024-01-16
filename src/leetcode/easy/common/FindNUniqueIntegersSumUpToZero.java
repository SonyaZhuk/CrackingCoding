package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/">1304. Find N Unique Integers Sum up to Zero</a>}.
 */
public class FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        int[] arr = new int[n];

        for (int i = 1; i < n; i+=2) {
            arr[i - 1] = i;
            arr[i] = -i;
        }

        return arr;
    }
}
