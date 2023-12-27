package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/sorting-the-sentence/">1859. Sorting the Sentence</a>}.
 */
public class SortingTheSentence {

    public String sortSentence(String s) {

        final String[] arr = s.split("\\s");
        int i = arr.length;
        StringBuilder result = new StringBuilder();

        for (int k = 1; k <= i; k++) {
            for (int j = 0; j < arr.length; j++)
                if (arr[j].contains(Integer.toString(k))) {
                    result = result.append(arr[j].replaceAll("\\d", ""));
                    if (k != i) result.append(" ");
                }
        }

        return result.toString();
    }
}
