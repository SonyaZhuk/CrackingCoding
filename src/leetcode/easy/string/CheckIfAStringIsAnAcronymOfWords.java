package leetcode.easy.string;

import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/">2828. Check if a String Is an Acronym of Words</a>}.
 */
public class CheckIfAStringIsAnAcronymOfWords {

    public boolean isAcronym(List<String> words, String s) {
        if (s.length() != words.size()) return false;

        for (var i = 0; i < s.length(); i++)
            if (s.charAt(i) != words.get(i).charAt(0)) return false;

        return true;
    }
}
