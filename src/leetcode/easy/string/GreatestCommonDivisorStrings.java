package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">1071. Greatest Common Divisor of Strings</a>}.
 */
public class GreatestCommonDivisorStrings {

    // Input: str1 = "ABABAB", str2 = "ABAB"
    // Output: "AB"
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        } else if (!str1.startsWith(str2)) {
            return "";
        } else if (str2.length() == 0) {
            return str1;
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }

    // The Euclidean algorithm
    public String gcdOfStringsI(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        //The greatest common divisor must be a prefix of each string, so we can try all prefixes.
        int gcdVal = gcd(str1.length(), str2.length());
        return str2.substring(0, gcdVal);
    }

    //Calculating gcd
    private int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }
}
