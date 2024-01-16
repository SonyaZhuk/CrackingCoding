package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">1281. Subtract the Product and Sum of Digits of an Integer</a>}.
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            prod *= r;
            n = n / 10;
        }
        return prod - sum;
    }
}
