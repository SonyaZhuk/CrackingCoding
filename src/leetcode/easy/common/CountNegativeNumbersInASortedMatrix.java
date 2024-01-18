package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">1351. Count Negative Numbers in a Sorted Matrix</a>}.
 */
public class CountNegativeNumbersInASortedMatrix {

    public int countNegatives(int[][] grid) {
        int counter = 0;

        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0) counter++;
                else break;
            }
        }
        return counter;
    }
}
