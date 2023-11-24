package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/plus-one/">66. Plus One</a>}.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null)
            throw new UnsupportedOperationException();

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
