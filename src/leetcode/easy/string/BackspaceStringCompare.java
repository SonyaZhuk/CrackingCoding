package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/backspace-string-compare/">844. Backspace String Compare</a>}.
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        return backspaceStr(s).equals(backspaceStr(t));
    }

    private String backspaceStr(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#' && sb.length() == 0) continue;
            else if (ch == '#') sb.deleteCharAt(sb.length() - 1);
            else sb.append(ch);
        }

        return sb.toString();
    }

    public boolean backspaceCompareI(String s, String t) {
        return backspaceStrI(s).equals(backspaceStrI(t));
    }

    private String backspaceStrI(String s) {
        int hash = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                hash++;
            } else if (hash > 0) {
                hash--;
            } else {
                sb.insert(0, s.charAt(i));
            }
        }
        return sb.toString();
    }
}
