package leetcode.easy.common;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/single-number/">136. Single Number</a>}.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int num = nums[0];

        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }

        return num;
    }

    public int singleNumberI(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        var iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            var next = iterator.next();
            int val = next.getValue();
            if (val == 1) return next.getKey();
        }

        return -1;
    }
}
