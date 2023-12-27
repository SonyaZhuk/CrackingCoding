package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/faulty-keyboard/">2810. Faulty Keyboard</a>}.
 */
public class FaultyKeyboard {

    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') ans.reverse();
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
