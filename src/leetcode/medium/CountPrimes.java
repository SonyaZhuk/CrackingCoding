package leetcode.medium;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/count-primes/">204. Count Primes</a>}.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int res = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) res++;
        }

        return res;
    }

    //don't work correctly

    public int countPrimesI(int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (isPrimeI(i)) {
                res++;
            }
        }

        return res;
    }

    private boolean isPrimeI(int number) {
        if (number < 2) return false;

        if (number % 2 == 0) {
            return number == 2;
        }

        if (number % 3 == 0) {
            return number == 3;
        }

        for (int i = 5; i * i < number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }

        return true;
    }
}
