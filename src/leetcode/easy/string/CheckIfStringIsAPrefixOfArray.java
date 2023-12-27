package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/">1961. Check If String Is a Prefix of Array</a>}.
 */
public class CheckIfStringIsAPrefixOfArray {

    public boolean isPrefixString(String s, String[] words) {

        String s1 = words[0];

        if (!s.startsWith(s1)) return false;

        if (s.equals(s1)) return true;

        for (int i = 1; i < words.length; i++) {
            s1 = s1.concat(words[i]);
            if (s.equals(s1)) return true;
        }

        return false;
    }
}
