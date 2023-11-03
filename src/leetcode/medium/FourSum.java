package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/4sum/">18. 4Sum</a>}.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        final List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                long s = nums[i] + nums[j];
                long rem = target - s;

                int left = j + 1;
                int right = nums.length - 1;

                 while(left < right) {

                     long sum = nums[left] + nums[right];

                     if (sum == rem) {
                         final ArrayList<Integer> temp = new ArrayList<>();
                         temp.add(nums[i]);
                         temp.add(nums[j]);
                         temp.add(nums[left]);
                         temp.add(nums[right]);
                         if (!res.contains(temp)) res.add(temp);
                         left++;
                         right--;
                     } else if (sum < rem) {
                         left++;
                     } else  {
                         right--;
                     }
                 }
            }
        }

        return res;
    }
}
