package leetcode.easy.string;

import java.util.HashMap;

/**
 * {@link <a href="https://leetcode.com/problems/determine-color-of-a-chessboard-square/">1812. Determine Color of a Chessboard Square</a>}.
 */
public class DetermineColorChessboardSquare {
    private HashMap<String, Boolean> alp = new HashMap<>() {{
        put("a", false);
        put("b", true);
        put("c", false);
        put("d", true);
        put("e", false);
        put("f", true);
        put("g", false);
        put("h", true);
    }};

    public boolean squareIsWhite(String coordinates) {
        String[] arr = coordinates.split("", 0);
        boolean isFlag = alp.get(arr[0]);
        int second = Integer.parseInt(arr[1]);
        if ((isFlag && second % 2 == 0) ||
                (isFlag && second % 2 != 0)) return false;

        return true;
    }


    public boolean squareIsWhiteI(String coordinates) {
        return coordinates.charAt(0) % 2 != coordinates.charAt(1) % 2;
    }
}
