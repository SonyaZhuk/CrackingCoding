package leetcode.easy.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/kth-distinct-string-in-an-array/">2053. Kth Distinct String in an Array</a>}.
 */
public class KthDistinctStringInArray {

    // Input: arr = ["d","b","c","b","c","a"], k = 2
    // Output: "a"
    public static String kthDistinct(String[] arr, int k) {
        final Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        for (String str : arr)
            if (map.get(str) == 1 && --k == 0) return str;

        return "";
    }
}
