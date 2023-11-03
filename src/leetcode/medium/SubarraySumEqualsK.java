package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/subarray-sum-equals-k/">560. Subarray Sum Equals K</a>}.
 */
public class SubarraySumEqualsK {

    //O(N^2)
    public int subarraySum(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) res++;
            }
        }
        return res;
    }

    //O(N)
    public int subarraySumI(int[] nums, int k) {
        int res = 0;

        final Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) res++;

            if (map.containsKey(sum - k)) res += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
