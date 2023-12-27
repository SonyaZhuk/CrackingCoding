package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/maximum-number-of-words-you-can-type/">1935. Maximum Number of Words You Can Type</a>}.
 */
public class MaximumNumberOfWordsYouCanType {

    // Input: text = "hello world", brokenLetters = "ad"
    // Output: 1
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split("\\s");

        if (brokenLetters.equalsIgnoreCase("")) return arr.length;

        String[] letters = brokenLetters.split("", 0);

        int counter = 0;

        for (String s : arr) {
            boolean flag = true;
            for (String letter : letters) {
                if (s.contains(letter)) {
                    flag = false;
                    break;
                }
            }
            if (flag) counter++;
        }
        return counter;
    }
}
