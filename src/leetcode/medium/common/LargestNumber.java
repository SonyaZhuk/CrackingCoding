package leetcode.medium.common;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/largest-number/">179. Largest Number</a>}.
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        final String[] sNums = new String[nums.length];
        for (int i = 0; i < sNums.length; i++) {
            sNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(sNums, (a , b) -> (b + a).compareTo(a + b));
        return sNums[0].equals("0") ? "0" : String.join("", sNums);
    }
}
