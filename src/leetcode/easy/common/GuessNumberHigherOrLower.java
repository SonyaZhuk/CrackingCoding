package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/guess-number-higher-or-lower/">374. Guess Number Higher or Lower</a>}.
 */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int ch = guess(mid);
            if (ch == 0) return mid;
            else if(ch == 1) start = mid + 1;
            else if (ch == -1) end = mid - 1;
        }

        return -1;
    }

    private int guess(int num) {
        //pick = 6
        if (num < 6) return 1;
        if (num > 6) return -1;
        return 0;
    }
}
