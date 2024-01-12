package leetcode.medium.common;

import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/triangle/">120. Triangle</a>}.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        //[[2],[3,4],[6,5,7],[4,1,8,3]]

        int res = triangle.get(0).get(0);
        int index = 0;
        for (int i = 1; i < triangle.size(); i++) {
            final List<Integer> list = triangle.get(i);
            int left = list.get(index);
            int right = list.get(index + 1);

            if (left <= right) {
                res += left;
            } else {
                res += right;
                index++;
            }
        }

        return res;
    }

    public int minimumTotalI(List<List<Integer>> triangle) {
        int[] arr = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                arr[j] = Math.min(arr[j], arr[j + 1]) + triangle.get(i).get(j);
            }
        }

        return arr[0];
    }
}
