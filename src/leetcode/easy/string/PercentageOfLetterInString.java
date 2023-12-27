package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/percentage-of-letter-in-string/">2278. Percentage of Letter in String</a>}.
 */
public class PercentageOfLetterInString {

    public int percentageLetter(String s, char letter) {
        char[] arr = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == letter) counter++;
        }
        double d = ((double) counter / (double) arr.length) * 100;
        return (int) d;
    }
}
