package leetcode.easy.common;

import java.util.Collections;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/lucky-numbers-in-a-matrix/>1380. Lucky Numbers in a Matrix</a>}.
 */
public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int minRow = Integer.MAX_VALUE;
            int indexColumn = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (minRow > matrix[i][j]) {
                    minRow = matrix[i][j];
                    indexColumn = j;
                }
            }

            int maxColumn = getMaxColumn(matrix, indexColumn);
            if (minRow == maxColumn) return List.of(minRow);
        }

        return Collections.emptyList();
    }

    private int getMaxColumn(int[][] matrix, int index) {
        int maxRow = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            maxRow = Math.max(maxRow, matrix[i][index]);
        }
        return maxRow;
    }
}
