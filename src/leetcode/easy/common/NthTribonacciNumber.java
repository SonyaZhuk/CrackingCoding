package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/n-th-tribonacci-number">1137. N-th Tribonacci Number</a>}.
 */
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public int tribonacciI(int n) {

        if (n <= 1) return n;
        if (n == 2) return 1;

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        for (int i = 3; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
        }
        return memo[n - 1] + memo[n - 2] + memo[n - 3];
    }

    public int tribonacciII(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int а = 0;
        int b = 1;
        int c = 1;
        for (int i = 3; i < n; i++) {
            int d = а + b + c;
            а = b;
            b = c;
            c = d;
        }
        return а + b + c;
    }
}
