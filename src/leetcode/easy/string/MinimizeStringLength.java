package leetcode.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/minimize-string-length/">2716. Minimize String Length</a>}.
 */
public class MinimizeStringLength {

    public int minimizedStringLength(String s) {
        final Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
