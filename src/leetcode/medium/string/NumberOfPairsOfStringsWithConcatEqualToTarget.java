package leetcode.medium.string;

/**
 * {@link <a href="https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/">2023. Number of Pairs of Strings With Concatenation Equal to Target</a>}.
 */
public class NumberOfPairsOfStringsWithConcatEqualToTarget {

    public int numOfPairs(String[] nums, String target) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (target.equals(nums[i] + nums[j])) res++;
                }
            }
        }

        return res;
    }
}
