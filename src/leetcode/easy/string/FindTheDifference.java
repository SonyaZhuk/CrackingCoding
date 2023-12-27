package leetcode.easy.string;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/find-the-difference/">389. Find the Difference</a>}.
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) return tArr[i];
        }

        return tArr[tArr.length - 1];
    }
}
