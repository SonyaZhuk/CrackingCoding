package leetcode.easy;


import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/majority-element/">169. Majority Element</a>}.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null) throw new UnsupportedOperationException();
        if (nums.length <= 2) return nums[0];

        int n = nums.length / 2;

        final Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > n) return nums[i];
        }

        return -1;
    }

    public int majorityElementI(int[] nums) {
        int voter = nums[0];
        int voterCount = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == voter)
                voterCount++;
            else
                voterCount--;

            if (voterCount == 0) {
                voter = nums[i];
                voterCount++;
            }
        }
        return voter;
    }
}
