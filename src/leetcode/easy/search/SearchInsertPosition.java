package leetcode.easy.search;

/**
 * {@link <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>}.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        if (nums == null) throw new UnsupportedOperationException();

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
