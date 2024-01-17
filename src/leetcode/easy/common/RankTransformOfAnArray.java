package leetcode.easy.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/rank-transform-of-an-array/">1331. Rank Transform of an Array</a>}.
 */
public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {

        if (arr.length < 1) return arr;

        int[] arrSorted = arr.clone();
        Arrays.sort(arrSorted);

        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arrSorted[0], rank);

        for (int i = 1; i < arrSorted.length; i++) {
            if (arrSorted[i - 1] != arrSorted[i]) map.put(arrSorted[i], ++rank);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
