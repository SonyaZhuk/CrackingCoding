package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/reverse-prefix-of-word/">2000. Reverse Prefix of Word</a>}.
 */
public class ReversePrefixOfWord {

    public static String reversePrefix(String word, char ch) {
        // Input: word = "abcdefd", ch = "d"
        // Output: "dcbaefd"
        int split = 0;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                split = i;
                break;
            }
        }

        StringBuilder builder = new StringBuilder();
        builder.append(word, 0, split + 1);
        builder.reverse();
        builder.append(word.substring(split + 1));

        return builder.toString();
    }
}
