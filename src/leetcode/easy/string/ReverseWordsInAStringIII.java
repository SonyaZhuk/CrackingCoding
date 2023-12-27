package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">557. Reverse Words in a String III</a>}.
 */
public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String str : arr) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = temp;
            }
            builder.append(chars).append(" ");
        }
        return builder.toString().trim();
    }
}
