package leetcode.easy;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * {@link <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>}.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        final Set<Integer> tree = new TreeSet<>();
        for (int num : nums) {
            tree.add(num);
        }

        final Iterator<Integer> it = tree.iterator();

        for (int i = 0; i < tree.size(); i++) {
            nums[i] = it.next();
        }
        return tree.size();
    }

    public int removeDuplicatesI(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
