package leetcode.medium.search;

/**
 * {@link <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">33. Search in Rotated Sorted Array</a>}.
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) return mid;


            // checks if we are in the left side of sorted array
            if (nums[start] <= nums[mid]) {

                // combined both the logic
                if (target > nums[mid] || target < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // checks if we are in the right side of sorted array
            else {
                if (target < nums[mid] || target > nums[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
