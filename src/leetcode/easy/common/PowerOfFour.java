package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/power-of-four/">342. Power of Four</a>}.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;
    }

    public boolean isPowerOfFourI(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;

        return isPowerOfFour(n / 4);
    }
}
