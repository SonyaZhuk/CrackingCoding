package leetcode.easy.string;

import java.util.ArrayList;


/**
 * {@link <a href="https://leetcode.com/problems/occurrences-after-bigram/">1078. Occurrences After Bigram</a>}.
 */
public class OccurrencesAfterBigram {

    // Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
    // Output: ["girl","student"]
    public String[] findOcurrences(String text, String first, String second) {

        final String[] textArr = text.split(" ");
        final ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < textArr.length - 2; i++) {
            if (textArr[i].equals(first) && textArr[i + 1].equals(second)) {
                res.add(textArr[i + 2]);
            }
        }

        return res.toArray(new String[0]);
    }
}
