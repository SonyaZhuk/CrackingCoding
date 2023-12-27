package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/">1796. Second Largest Digit in a String</a>}.
 */
public class SecondLargestDigitInAString {

    public int secondHighest(String s) {
        int first = -1, sec = -1;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int d = c - '0';
                if (first < d) {
                    sec = first;
                    first = d;
                } else if (sec < d && d < first) {
                    sec = d;
                }
            }
        }
        return sec;
    }
}
