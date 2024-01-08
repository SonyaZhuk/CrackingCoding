package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/base-7/">504. Base 7</a>}.
 */
public class Base7 {

    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public String convertToBase7I(int num) {
        int base = 1;
        int ans = 0;
        while (num != 0) {
            int rem = num % 7;
            ans += base * rem;
            base *= 10;
            num /= 7;
        }
        return Integer.toString(ans);
    }
}
