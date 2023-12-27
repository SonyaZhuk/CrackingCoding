package leetcode.medium;

/**
 * {@link <a href="https://leetcode.com/problems/adding-spaces-to-a-string/">2109. Adding Spaces to a String</a>}.
 */
public class AddingSpacesToAString {

    public String addSpaces(String s, int[] spaces) {

        StringBuilder builder = new StringBuilder(s);
        int counter = 0;
        for (int sp: spaces) {
            builder.insert(sp + counter, " ");
            counter++;
        }

        return builder.toString();
    }
}
