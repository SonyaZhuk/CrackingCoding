package leetcode.easy.common;

import java.util.Arrays;

/**
 * {@link <a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/>1491. Average Salary Excluding the Minimum and Maximum Salary</a>}.
 */
public class AverageSalaryExcludingTheMinAndMaxSalary {

    public double average(int[] salary) {
        Arrays.sort(salary);

        int sum = 0;
        int count = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            count++;
        }

        return (double) sum / count;
    }

    public double averageI(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        for (int i = 1; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != min && salary[i] != max) {
                sum += salary[i];
                count++;
            }
        }

        return (double) sum / count;
    }
}
