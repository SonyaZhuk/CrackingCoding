package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/matrix-diagonal-sum/>1572. Matrix Diagonal Sum</a>}.
 */
public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i];
            if (i != mat.length - i - 1)
                sum = sum + mat[i][mat.length - i - 1];
        }
        return sum;
    }
}
