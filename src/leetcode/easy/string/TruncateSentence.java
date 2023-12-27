package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/truncate-sentence/">1816. Truncate Sentence</a>}.
 */
public class TruncateSentence {

    public String truncateSentence(String s, int k) {
        char[] arr = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == ' ') {
                k--;
                if (k == 0) return builder.toString();
            }
            builder.append(arr[i]);
        }
        return builder.toString();
    }
}
