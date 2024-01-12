package leetcode.medium.common;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/longest-consecutive-sequence/">128. Longest Consecutive Sequence</a>}.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        if (nums == null)
            throw new UnsupportedOperationException();

        int n = nums.length;
        if (n < 2) return n;

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        int count = 1;

        if (set.size() < 2) return count;

        Iterator<Integer> iterator = set.iterator();
        int temp = iterator.next();

        while (iterator.hasNext()) {
            int head = iterator.next();
            int m = head - temp;
            if (m == 1) count++;
            else break;

            temp = head;
        }

        return count;
    }

    //O(NlogN)
    public int longestConsecutiveI(int[] nums) {
        int n = nums.length;
        if (n < 2) return n;

        Arrays.sort(nums);

        int res = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) continue;
            else if (nums[i] == nums[i - 1] + 1) count++;
            else {
               res = Math.max(res, count);
               count = 1;
            }
        }

        return Math.max(res, count);
    }
}
