package leetcode.easy.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/find-lucky-integer-in-an-array/>1394. Find Lucky Integer in an Array</a>}.
 */
public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        //1,2,2,3,3,3
        Arrays.sort(arr);
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.containsKey(arr[i]) && map.get(arr[i]) == arr[i]) return arr[i];
        }

        return -1;
    }

    public int findLuckyI(int[] arr) {
        int[] frequency = new int[501];

        for (int num : arr) {
            frequency[num]++;
        }

        int maxLucky = -1;

        for (int i = 1; i <= 500; i++) {
            if (frequency[i] == i) {
                maxLucky = Math.max(maxLucky, i);
            }
        }

        return maxLucky;
    }
}
