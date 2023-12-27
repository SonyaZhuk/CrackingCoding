package leetcode.easy.string;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * {@link <a href="https://leetcode.com/problems/sort-the-people/">2418. Sort the People</a>}.
 */
public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        return map.values().toArray(new String[map.size()]);
    }

    public String[] sortPeopleI(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = 1; j < heights.length - i; j++) {
                if (heights[j - 1] < heights[j]) {

                    String temp = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = temp;

                    int h = heights[j - 1];
                    heights[j - 1] = heights[j];
                    heights[j] = h;
                }
            }
        }
        return names;
    }

    public String[] sortPeopleII(String[] names, int[] heights) {

        String[] ans = new String[names.length];
        String str;
        int max = 0, temp = 0, temp1;
        for (int i = 0; i < names.length; i++) {
            for (int j = i; j < heights.length; j++) {
                if (heights[j] > max) {
                    max = heights[j];
                    temp = j;
                }
            }
            ans[i] = names[temp];
            //swapping the heights making it in descending order
            temp1 = heights[i];
            heights[i] = heights[temp];
            heights[temp] = temp1;
            //swapping the names
            str = names[i];
            names[i] = names[temp];
            names[temp] = str;
        }
        return ans;
    }
}
