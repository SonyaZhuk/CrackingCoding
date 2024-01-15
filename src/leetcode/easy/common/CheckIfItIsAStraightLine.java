package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/check-if-it-is-a-straight-line/">1232. Check If It Is a Straight Line</a>}.
 */
public class CheckIfItIsAStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) return true;

        int xMove = coordinates[1][0] - coordinates[0][0];
        int yMove = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < coordinates.length; i++) {
            int x = coordinates[i][0] - coordinates[i - 1][0];
            int y = coordinates[i][1] - coordinates[i - 1][1];
            // y = k * x;
            // k = yMove / xMove;
            // y * xMove = x * yMove;
            if (y * xMove != x * yMove) return false;
        }

        return true;
    }

    public boolean checkStraightLineI(int[][] coordinates) {
        if (coordinates.length <= 2) return true;

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if (!((y - y1) * (x2 - x1) == (y2 - y1) * (x - x1))) return false;
        }
        return true;
    }
}
