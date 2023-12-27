package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/reverse-string-ii/">541. Reverse String II</a>}.
 */
public class ReverseStringII {

    // Input: s = "abcdefg", k = 2
    // Output: "bacdfeg"
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }

    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
