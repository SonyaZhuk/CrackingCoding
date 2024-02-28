package leetcode.medium.common;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/subsets/">78. Subsets</a>}.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsets(nums, res, temp, 0);
        return res;
    }

    private void subsets(int[] nums, List<List<Integer>> res, List<Integer> temp, int i) {
        if (i == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        subsets(nums, res, temp, i + 1);

        temp.remove(temp.size() - 1);
        subsets(nums, res, temp, i + 1);
    }
}
