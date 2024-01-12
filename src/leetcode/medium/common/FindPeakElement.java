package leetcode.medium.common;

/**
 * {@link <a href="https://leetcode.com/problems/find-peak-element/">162. Find Peak Element</a>}.
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int len = nums.length;

        if (len == 1) return 0;

        for (int i = 1; i < len - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
        }

        if (nums[0] > nums[1]) return 0;
        if (nums[len - 1] > nums[len - 2]) return len - 1;

        return -1;
    }

    //O(logN)
    public int findPeakElementI(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int i = 1;
        int j = n - 2;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid] < nums[mid - 1]) j = mid - 1;
            else if (nums[mid] < nums[mid + 1]) i = mid + 1;
        }
        return -1;
    }
}
