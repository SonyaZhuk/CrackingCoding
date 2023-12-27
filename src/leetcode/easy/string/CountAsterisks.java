package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/count-asterisks/">2315. Count Asterisks</a>}.
 */
public class CountAsterisks {

    public int countAsterisks(String s) {
        char[] arr = s.toCharArray();
        int count = 0, c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '|') c++;
            if (c % 2 == 0 && arr[i] == '*') count++;
        }
        return count;
    }
}