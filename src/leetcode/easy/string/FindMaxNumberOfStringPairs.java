package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/find-maximum-number-of-string-pairs/">2744. Find Maximum Number of String Pairs</a>}.
 */
public class FindMaxNumberOfStringPairs {

    public int maximumNumberOfStringPairs(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++)
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0))
                    counter++;
        }
        return counter;
    }
}
