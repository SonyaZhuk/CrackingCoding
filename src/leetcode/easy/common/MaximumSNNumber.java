package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/maximum-69-number/">1323. Maximum 69 Number</a>}.
 */
public class MaximumSNNumber {

    public int maximum69Number(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}
