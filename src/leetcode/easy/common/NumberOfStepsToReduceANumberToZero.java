package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">1342. Number of Steps to Reduce a Number to Zero</a>}.
 */
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) num = num / 2;
            else num -= 1;
            steps++;
        }
        return steps;
    }
}
