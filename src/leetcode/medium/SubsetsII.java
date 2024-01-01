package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/subsets-ii/">90. Subsets II</a>}.
 */
public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsetsWithDupRec(0, nums, res, temp);
        return res;
    }

    private void subsetsWithDupRec(int index, int[] nums, List<List<Integer>> res, List<Integer> temp) {
        res.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            if (i == index || (i > index && nums[i] != nums[i - 1])) {
                temp.add(nums[i]);
                subsetsWithDupRec(i + 1, nums, res, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
