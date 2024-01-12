package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a>}.
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        if (haystack.isBlank() || needle.isBlank()) return -1;

        final StringBuilder h = new StringBuilder(haystack);

        char needleFirst = needle.charAt(0);

        for (int i = 0; i < h.length() - needle.length() + 1; i++) {
            char haystackCh = haystack.charAt(i);
            if (haystackCh == needleFirst) {
                final String temp = h.substring(i, i + needle.length());
                if (temp.equals(needle)) return i;
            }
        }

        return -1;
    }
}
