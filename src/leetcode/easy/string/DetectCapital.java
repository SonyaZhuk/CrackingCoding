package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/detect-capital/">520. Detect Capital</a>}.
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        String wordUpperCase = word.toUpperCase();
        if (wordUpperCase.equals(word)) return true;

        String wordSubString = word.substring(1);
        if (wordSubString.equals(wordSubString.toLowerCase())) return true;

        return false;
    }
}