package leetcode.medium;

/**
 * {@link <a href="https://leetcode.com/problems/factorial-trailing-zeroes/">172. Factorial Trailing Zeroes</a>}.
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }

        return res;
    }

    public int trailingZeroesI(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
