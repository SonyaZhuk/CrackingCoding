package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/">1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence</a>}.
 */
public class CheckWordOccursPrefixAnyWordSentence {

    // Input: sentence = "i love eating burger", searchWord = "burg"
    // Output: 4
    public int isPrefixOfWord(String sentence, String searchWord) {
        final String[] arr = sentence.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord)) return i + 1;
        }
        return -1;
    }


    public int isPrefixOfWordI(String sentence, String searchWord) {
        if (0 == sentence.indexOf(searchWord)) return 1;

        int index = sentence.indexOf(" " + searchWord);
        if (index == -1) return -1;

        int count = 0;
        for (int i = 0; i < index + 1; i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
