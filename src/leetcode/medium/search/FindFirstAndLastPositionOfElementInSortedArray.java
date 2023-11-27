package leetcode.medium.search;

/**
 * {@link <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">34. Find First and Last Position of Element in Sorted Array</a>}.
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    //O(n)
    public int[] searchRange(int[] nums, int target) {

        int indexFirst = -1;
        int indexLast = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (indexFirst == -1) {
                    indexFirst = i;
                } else {
                    indexLast = i;
                }
            }
        }

        if (indexLast == -1 && indexFirst != -1) indexLast = indexFirst;

        return (indexFirst != -1) ?
                new int[]{indexFirst, indexLast} : new int[]{-1, -1};
    }

    //O(logN)
    public int[] searchRangeI(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = getIndex(nums, target, true);
        res[1] = getIndex(nums, target, false);
        return res;
    }

    private int getIndex(int[] nums, int target, boolean isFirst) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (isFirst) end = mid - 1;
                else start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return index;
    }
}
