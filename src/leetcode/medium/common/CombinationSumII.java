package leetcode.medium.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/combination-sum-ii/">40. Combination Sum II</a>}.
 */
public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private void findCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i - 1] == arr[i]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }

            ds.add(arr[i]);

            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
