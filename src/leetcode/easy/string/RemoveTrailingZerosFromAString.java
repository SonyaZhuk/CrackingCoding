package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/remove-trailing-zeros-from-a-string/">2710. Remove Trailing Zeros From a String</a>}.
 */
public class RemoveTrailingZerosFromAString {

    public String removeTrailingZeros(String num) {
        int counter = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') break;
            counter++;
        }
        return num.substring(0, num.length() - counter);
    }
}
