package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/shuffle-string/">1528. Shuffle String</a>}.
 */
public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
    }
}
