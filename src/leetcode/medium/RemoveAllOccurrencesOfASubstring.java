package leetcode.medium;

/**
 * {@link <a href="https://leetcode.com/problems/remove-all-occurrences-of-a-substring/">1910. Remove All Occurrences of a Substring</a>}.
 */
public class RemoveAllOccurrencesOfASubstring {

    public String removeOccurrences(String s, String part) {
        if (s.length() == 1) return s;

        int index = s.indexOf(part);
        while (index != -1) {
            s = s.replaceFirst(part, "");
            index = s.indexOf(part);
        }
        return s;
    }
}
