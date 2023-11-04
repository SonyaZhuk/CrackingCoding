package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/merge-intervals/">56. Merge Intervals</a>}.
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<List<Integer>> temp = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            while (i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }

            final List<Integer> row = new ArrayList<>();
            row.add(start);
            row.add(end);
            temp.add(row);
        }

        int[][] result = new int[temp.size()][2];

        for (int i = 0; i < temp.size(); i++) {
            result[i][0] = temp.get(i).get(0);
            result[i][1] = temp.get(i).get(1);
        }
        return result;
    }
}
