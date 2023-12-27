package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/robot-return-to-origin/">657. Robot Return to Origin</a>}.
 */
public class RobotReturnToOrigin {
    //"UD"
    //"LR"
    public static boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0) return false;
        int udCount = 0;
        int lrCount = 0;

        char[] arr = moves.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'U':
                    udCount++;
                    break;
                case 'D':
                    udCount--;
                    break;
                case 'L':
                    lrCount++;
                    break;
                case 'R':
                    lrCount--;
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        return (lrCount == 0 && udCount == 0);
    }
}
