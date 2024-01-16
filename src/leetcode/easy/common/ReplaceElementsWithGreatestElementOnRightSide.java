package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">1299. Replace Elements with Greatest Element on Right Side</a>}.
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                max = Math.max(arr[j], max);
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public int[] replaceElementsI(int[] arr) {
        var max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            var tmp = arr[i];
            arr[i] = max;
            if (tmp > max) {
                max = tmp;
            }
        }
        return arr;
    }
}