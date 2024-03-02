package leetcode.hard;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * {@link <a href="https://leetcode.com/problems/first-missing-positive/">41. First Missing Positive</a>}.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) k++;
        }

        return k;
    }

    public int firstMissingPositiveI(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int n : nums) set.add(n);

        int k = 1;
        for (int el : set) {
            if (el > 0) {
                if (el == k) k++;
                else return k;
            }
        }

        return k;
    }

    public int firstMissingPositiveII(int[] nums) {
        nums = Arrays.stream(nums).filter(n -> n > 0).distinct().toArray();
        Arrays.sort(nums);

        int n = nums.length;
        if (n == 0 || nums[0] != 1) return 1;

        for (int i = 0; i < n - 1; i++) {
            if ((nums[i + 1] != nums[i] + 1)) {
                return nums[i] + 1;
            }
        }

        return nums[n - 1] + 1;
    }

    public int firstMissingPositiveIII(int[] nums) {
        int n = nums.length;
        boolean[] found = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0 && nums[i] <= n) {
                found[nums[i]] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!found[i]) return i;
        }

        return n + 1;
    }
}
