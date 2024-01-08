package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a>}.
 */
public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public int fibI(int n) {
        return fibonacci(n, new int[n + 1]);
    }

    private int fibonacci(int i, int[] memo) {
        if (i == 0 || i == 1) return i;

        if (memo[i] == 0) {
            memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
        }
        return memo[i];
    }

    public int fibII(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1] + memo[n - 2];
    }

    public int fibIII(int n) {
        if (n == 0) return 0;
        int а = 0;
        int b = 1;
        for (int i = 2; i < n; i++) {
            int с = а + b;
            а = b;
            b = с;
        }
        return а + b;
    }
}
