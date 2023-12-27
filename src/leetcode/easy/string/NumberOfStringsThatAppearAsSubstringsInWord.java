package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/">1967. Number of Strings That Appear as Substrings in Word</a>}.
 */
public class NumberOfStringsThatAppearAsSubstringsInWord {

    public int numOfStrings(String[] patterns, String word) {

        int result = 0;

        for (String str : patterns) {
            for (int i = word.length() - 1; i >= 0; i--) {
                String s1 = word.substring(0, i + 1);
                if (s1.contains(str)) {
                    result = result + 1;
                    break;
                }
            }
        }

        return result;
    }
}
