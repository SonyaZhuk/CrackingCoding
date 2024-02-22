package leetcode.medium.common;

/**
 * {@link <a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String to Integer (atoi)</a>}.
 */
public class StringToInteger {
    public int myAtoi(String s) {
        boolean signPos = true;
        long ans = 0;
        int i = 0;

        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (ch == '+' || ch == '-') i++;
                if (ch == '-') signPos = false;
                break;
            }
        }

        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch > '9' || ch < '0') break;
            ans = ans * 10 + (ch - '0');

            if (ans > 2147483647) {
                return signPos ? 2147483647 : -2147483648;
            }
        }

        return signPos ? (int) ans : (-1) * (int) ans;
    }
}
