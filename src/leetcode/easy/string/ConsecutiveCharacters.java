package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/consecutive-characters/>1446. Consecutive Characters</a>}.
 */
public class ConsecutiveCharacters {

    public int maxPower(String s) {
        int c = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) c++;
            else {
                max = Math.max(max, c);
                c = 1;
            }
        }

        return Math.max(max, c);
    }
}
