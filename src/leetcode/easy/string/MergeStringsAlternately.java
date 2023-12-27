package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/merge-strings-alternately/">1768. Merge Strings Alternately</a>}.
 */
public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder builder = new StringBuilder();
        String tail = "";

        if (word1.length() != word2.length()) {
            if (word1.length() > word2.length()) {
                tail = word1.substring(word2.length());
                word1 = word1.substring(0, word2.length());
            } else {
                tail = word2.substring(word1.length());
                word2 = word2.substring(0, word1.length());
            }
        }

        char[] wordArr1 = word1.toCharArray();
        char[] wordArr2 = word2.toCharArray();
        for (int i = 0; i < wordArr1.length; i++) {
            builder.append(wordArr1[i]).append(wordArr2[i]);
        }

        return builder.append(tail).toString();
    }
}
