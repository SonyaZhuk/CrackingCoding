package leetcode.medium.string;

/**
 * {@link <a href="https://leetcode.com/problems/reverse-words-in-a-string/">151. Reverse Words in a String</a>}.
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {

        final String[] arr = s.trim().split("\\s+");

        final StringBuilder builder = new StringBuilder(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0 ; i--) {
            builder.append(" ");
            builder.append(arr[i]);
        }

        return builder.toString();
    }
}
