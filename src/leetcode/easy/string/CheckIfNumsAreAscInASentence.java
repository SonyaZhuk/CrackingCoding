package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/">2042. Check if Numbers Are Ascending in a Sentence</a>}.
 */
public class CheckIfNumsAreAscInASentence {

    public boolean areNumbersAscending(String s) {

        int prev = 0;
        String[] arr = s.split(" ");
        for (String str : arr) {
            try {
                int num = Integer.parseInt(str);
                if (prev >= num) return false;
                prev = num;
            } catch (NumberFormatException e) {
            }
        }
        return true;
    }
}
