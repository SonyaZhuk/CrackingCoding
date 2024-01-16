package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/">1287. Element Appearing More Than 25% In Sorted Array</a>}.
 */
public class ElementAppearingMoreThanTFProcentInSortedArray {

    public int findSpecialInteger(int[] arr) {
        if (arr.length <= 2) return arr[0];

        int tfP = arr.length / 4;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) count++;
            else count = 1;

            if (count > tfP) return arr[i];
        }
        return -1;
    }

    public int findSpecialIntegerI(int[] arr) {
        int tfP = arr.length / 4;

        for (int i = 0; i < arr.length - tfP; i++) {
            if (arr[i] == arr[i + tfP]) {
                return arr[i];
            }
        }
        return -1;
    }
}
