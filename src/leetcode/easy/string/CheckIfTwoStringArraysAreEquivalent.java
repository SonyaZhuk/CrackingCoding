package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/">1662. Check If Two String Arrays are Equivalent</a>}.
 */
public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        for (String s : word1) {
            w1.append(s);
        }

        for (String s : word2) {
            w2.append(s);
        }

        return w1.toString().equalsIgnoreCase(w2.toString());
    }
}
