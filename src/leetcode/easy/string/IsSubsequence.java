package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/is-subsequence/">392. Is Subsequence</a>}.
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) return true;
        if (s.length() > t.length()) return false;

        int pos = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(pos) == t.charAt(i)) pos++;
            if (pos == s.length()) return true;

        }
        return false;
    }
}
