package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>}.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    nums[0] = i;
                    nums[1] = j;
                    return res;
                }
            }
        }

        return res;
    }

    public int[] twoSumI(int[] nums, int target) {

        final Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = target - nums[i];

            if (map.containsKey(curr)) return new int[] {map.get(curr), i};
            map.put(nums[i], i);

        }

        return new int[] {-1, -1};
    }
}
