package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/>1523. Count Odd Numbers in an Interval Range</a>}.
 */
public class CountOddNumbersInAnIntervalRange {

    public int countOdds(int low, int high) {
        if (high < low) return -1;

        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 == 1) count++;
        }

        return count;
    }

    public int countOddsI(int low, int high) {
        if (high < low) return -1;

        if (low % 2 == 0 && high % 2 == 0)
            return (high - low) / 2;
        else if (low % 2 == 1 && high % 2 == 1)
            return (high - low) / 2 + 1;

        return (high - low + 1) / 2;
    }
}
