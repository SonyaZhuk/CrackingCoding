package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/length-of-last-word/">58. Length of Last Word</a>}.
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        if (s == null || s.isBlank()) return -1;

        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public int lengthOfLastWordI(String s) {
        if (s.isBlank()) return -1;

        final String s1 = s.trim();

        int count = 0;
        for (int i = s1.length() - 1; i >=0; i--) {
            if (s1.charAt(i) != ' ') count++;
            else return count;
        }

        return count;
    }
}
