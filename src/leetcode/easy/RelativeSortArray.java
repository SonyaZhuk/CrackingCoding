package leetcode.easy;

import java.util.Map;
import java.util.TreeMap;

/**
 * {@link <a href="https://leetcode.com/problems/relative-sort-array/">1122. Relative Sort Array</a>}.
 */
public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> mapArr1 = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++) {
            mapArr1.put(arr1[i], mapArr1.getOrDefault(arr1[i], 0) + 1);
        }

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int count = mapArr1.get(arr2[i]);
            for (int j = index; j < index + count; j++) {
                arr1[j] = arr2[i];
            }
            index += count;
            mapArr1.remove(arr2[i]);
        }

        for (var map : mapArr1.entrySet()) {
            int count = map.getValue();
            for (int i = index; i < index + count; i++) {
                arr1[i] = map.getKey();
            }
            index += count;
        }

        return arr1;
    }

    public int[] relativeSortArrayI(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] > 0) {
                count[arr2[i]]--;
                arr1[j++] = arr2[i];
            }
        }
        for (int i = 0; i <= 1000; i++) {
            while (count[i] > 0) {
                arr1[j++] = i;
                count[i]--;
            }
        }
        return arr1;
    }
}
