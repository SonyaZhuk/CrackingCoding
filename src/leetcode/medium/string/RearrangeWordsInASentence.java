package leetcode.medium.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * {@link <a href="https://leetcode.com/problems/rearrange-words-in-a-sentence/">1451. Rearrange Words in a Sentence</a>}.
 */
public class RearrangeWordsInASentence {

    public static String arrangeWords(String text) {
        //"Keep calm and code on"
        String[] arr = text.toLowerCase().split(" ");

        Arrays.sort(arr, Comparator.comparingLong(String::length));

        StringBuilder builder = new StringBuilder();

        for (String word : arr) {
            builder.append(word + " ");
        }
        String res = builder.toString();
        return Character.toUpperCase(res.charAt(0)) + res.substring(1).stripTrailing();
    }

    public String arrangeWordsI(String text) {
        String[] strArr = text.split(" ");
        Arrays.sort(strArr, (str1, str2) -> str1.length() - str2.length());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                sb.append(strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1));
            } else {
                sb.append(strArr[i].toLowerCase());
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
