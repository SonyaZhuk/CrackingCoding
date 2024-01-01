package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/combination-sum/">39. Combination Sum</a>}.
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private void findCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target < 0) return;
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            ds.add(arr[i]);
            findCombinations(i, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
