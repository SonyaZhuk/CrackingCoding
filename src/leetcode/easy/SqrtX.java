package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/sqrtx/">69. Sqrt(x)</a>}.
 */
public class SqrtX {

    public int mySqrt(int x) {
        if (x <= 1) return x;

        int start = 1;
        long mid = 0;
        int end = x / 2 + 1;
        int sqrt = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            long q = mid * mid;
            if (q == x) {
                return (int) mid;
            } else if (q < x) {
                start = (int) mid + 1;
                sqrt = (int) mid;
            } else {
                end = (int) mid - 1;
            }
        }
        return sqrt;
    }
}
