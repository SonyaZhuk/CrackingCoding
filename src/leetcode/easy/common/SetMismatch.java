package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/set-mismatch/">645. Set Mismatch</a>}.
 */
public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        //[1,2,2,4]

        int[] res = new int[2];

        int[] arr = new int[nums.length + 1];

        for (int num : nums) {
            arr[num]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) res[0] = i;
            if (arr[i] == 0) res[1] = i;
        }
        return res;
    }
}
