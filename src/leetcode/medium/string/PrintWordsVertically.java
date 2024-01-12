package leetcode.medium.string;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/print-words-vertically/">1324. Print Words Vertically</a>}.
 */
public class PrintWordsVertically {

    public List<String> printVertically(String s) {
        //"TO BE OR NOT TO BE"
        List<String> res = new ArrayList<>();
        String[] arr = s.split(" ");
        int maxLen = 0;
        for (String str: arr) {
            if (str.length() > maxLen) maxLen = str.length();
        }

        for (int i = 0; i < maxLen; i++) {
            StringBuilder builder = new StringBuilder();
            for (String str: arr) {
                char ch = (str.length() > i) ? str.charAt(i) : ' ';
                builder.append(ch);
            }
            res.add(builder.toString().stripTrailing());
        }
        return res;
    }
}
