package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">1295. Find Numbers with Even Number of Digits</a>}.
 */
public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        //nums = [12,345,2,6,7896]
        int counter = 0;
        for (int num : nums) {
            if (isEven(num)) counter++;
        }

        return counter;
    }

    private boolean isEven(int num) {
        int counter = 0;
        while (num > 0) {
            num = num / 10;
            counter++;
        }
        return counter % 2 == 0;
    }
}
