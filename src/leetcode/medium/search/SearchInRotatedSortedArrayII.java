package leetcode.medium.search;

/**
 * {@link <a href="https://leetcode.com/problems/search-in-rotated-sorted-array-ii/">81. Search in Rotated Sorted Array II</a>}.
 */
public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) return true;

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low += 1;
                high -= 1;
                continue;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
