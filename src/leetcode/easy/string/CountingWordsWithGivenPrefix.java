package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix/">2185. Counting Words With a Given Prefix</a>}.
 */
public class CountingWordsWithGivenPrefix {

    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String w : words) {
            if (w.startsWith(pref)) res++;
        }
        return res;
    }
}
