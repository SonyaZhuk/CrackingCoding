package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/transpose-matrix/">867. Transpose Matrix</a>}.
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;

        int[][] matrixT = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }
        return matrixT;
    }
}
