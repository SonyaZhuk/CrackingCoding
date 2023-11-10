package leetcode.medium.search;

/**
 * {@link <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">153. Find Minimum in Rotated Sorted Array</a>}.
 */
public class FindMinInRotatedSortedArray {

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[end]) end = mid;
            else start = mid + 1;

        }

        return nums[start];
    }
}
