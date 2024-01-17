package leetcode.easy.common;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * {@link <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">1337. The K Weakest Rows in a Matrix</a>}.
 */
public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {

        final Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < mat.length; i++) {
            int counter = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) counter++;
            }
            map.put(i, counter);
        }

        final PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->
                map.get(a) == map.get(b) ? a - b : (map.get(a) - map.get(b)));
        pq.addAll(map.keySet());

        int count = 0;
        int[] res = new int[k];
        while (count < k) {
            res[count++] = pq.poll();
        }
        return res;
    }
}
