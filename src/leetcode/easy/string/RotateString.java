package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/rotate-string/">796. Rotate String</a>}.
 */
public class RotateString {

    public boolean rotateString(String s, String goal) {

        if (s.equals(goal)) return true;

        int length = s.length();

        while (length != 0) {
            String first = s.substring(0, 1);
            String tail = s.substring(1, s.length());

            s = tail.concat(first);

            if (goal.equals(s)) return true;
            length = length - 1;
        }
        return false;
    }
}
