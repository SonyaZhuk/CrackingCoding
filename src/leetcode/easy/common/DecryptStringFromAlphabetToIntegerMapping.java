package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/>1309. Decrypt String from Alphabet to Integer Mapping</a>}.
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            int number;
            if (s.charAt(i) == '#') {
                number = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                i -= 2;
            } else {
                number = s.charAt(i) - '0';
            }
            // Convert the numeric value to its alphabetic representation
            sb.append((char) (number + 96));
        }
        return sb.reverse().toString();
    }
}
