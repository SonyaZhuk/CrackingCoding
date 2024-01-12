package leetcode.easy.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/longest-harmonious-subsequence/">594. Longest Harmonious Subsequence</a>}.
 */
public class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int current = map.get(key) + map.get(key + 1);
                res = Math.max(res, current);
            }
        }
        return res;
    }

    public int findLHSI(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            while (nums[i] - nums[j] > 1) j++;
            if (nums[i] - nums[j] == 1)
                res = Math.max(res, i - j + 1);
        }

        return res;
    }
}
