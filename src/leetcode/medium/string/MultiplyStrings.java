package leetcode.medium.string;

import java.math.BigInteger;

/**
 * {@link <a href="https://leetcode.com/problems/multiply-strings/>43. Multiply Strings</a>}.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.multiply(n2).toString();
    }
}