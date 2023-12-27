package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/">1221. Split a String in Balanced Strings</a>}.
 */
public class BalancedStringSplit {

    public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int count = 0, c = 0;
        if (s.length() == 2) return 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'L') {
                c++;
            } else {
                c--;
            }
            if (c == 0) count++;
        }
        return count;
    }
}
