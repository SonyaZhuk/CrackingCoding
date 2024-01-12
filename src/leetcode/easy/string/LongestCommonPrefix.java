package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/longest-common-prefix/">14. Longest Common Prefix</a>}.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int index = 1; index < strs.length; index++) {
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
