package leetcode.easy.common;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/check-if-n-and-its-double-exist/">1346. Check If N and Its Double Exist</a>}.
 */
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = search(arr, arr[i] * 2);
            if (index >= 0 && i != index) return true;
        }
        return false;
    }

    private int search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) return i;
        }
        return -1;
    }

    public boolean checkIfExistI(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) return true;
            set.add(num);
        }
        return false;
    }

    public boolean checkIfExistII(int[] arr) {

        int[] doubleArr = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
            doubleArr[i] = 2 * arr[i];
        }

        for (int i = 0; i < doubleArr.length; i++) {
            if (map.containsValue(doubleArr[i])) {
                if (doubleArr[i] != 0) return true;
                else {
                    if (getKeys(map, doubleArr[i]).size() >= 2) return true;
                }
            }
        }

        return false;
    }

    private Set<Integer> getKeys(Map<Integer, Integer> map, int value) {
        Set<Integer> keys = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}
