package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/">1374. Generate a String With Characters That Have Odd Counts</a>}.
 */
public class StringWithOddCounts {

    public String generateTheString(int n) {

        if (n <= 1) return "x";

        return (n % 2 == 0) ? "x" + "y".repeat(n - 1) : "xy" + "z".repeat(n - 2);
    }
}
