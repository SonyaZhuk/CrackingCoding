package leetcode.medium;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/search-in-rotated-sorted-array-ii/">81. Search in Rotated Sorted Array II</a>}.
 */
public class SearchInRotatedSortedArrayII {

    //O(N*logN)
    public boolean search(int[] nums, int target) {
        //Input: nums = [2,5,6,0,0,1,2], target = 0

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return true;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }


    public boolean searchI(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;
            if ((nums[mid] == nums[start]) && (nums[end] == nums[mid])) {
                start++;
                end--;
            } else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}
