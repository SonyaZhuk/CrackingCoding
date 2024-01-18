package leetcode.easy.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/>1365. How Many Numbers Are Smaller Than the Current Number</a>}.
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sortedNums.length; i++) {
            map.putIfAbsent(sortedNums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
