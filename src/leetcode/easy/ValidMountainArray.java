package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/valid-mountain-array/">941. Valid Mountain Array</a>}.
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int len = arr.length - 1;

        int mid = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] >= arr[i + 1]) {
                mid = i;
                break;
            }
        }

        if (mid == 0) return false;

        for (int i = mid; i < len; i++) {
            if (arr[i] <= arr[i + 1]) return false;
        }

        return true;
    }

    public boolean validMountainArrayI(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length - 1;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        return (i > 0 && i == j && j < n);
    }
}
