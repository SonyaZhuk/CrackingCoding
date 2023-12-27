package leetcode.easy.string;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/count-prefixes-of-a-given-string/">2255. Count Prefixes of a Given String</a>}.
 */
public class CountPrefixesGivenString {

    // Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
    // Output: 3
    public int countPrefixes(String[] words, String s) {
        return (int) Arrays.stream(words).filter(s::startsWith).count();
    }


    public int countPrefixesI(String[] words, String s) {

        int counter = 0;
        for (String str : words) {
            if (str.startsWith(s)) counter++;
        }
        return counter;
    }


    public int countPrefixesII(String[] words, String s) {
        int result = 0;
        for (int i = 0; i <= s.length(); i++) {
            String x = s.substring(0, i);
            for (int j = 0; j < words.length; j++) {
                if (x.equals(words[j]))
                    result++;
            }
        }
        return result;
    }
}
