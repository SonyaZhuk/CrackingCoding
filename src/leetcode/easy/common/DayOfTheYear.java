package leetcode.easy.common;

import java.time.LocalDate;

/**
 * {@link <a href="https://leetcode.com/problems/day-of-the-year">1154. Day of the Year</a>}.
 */
public class DayOfTheYear {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public int dayOfYearI(String date) {
        final String[] arr = date.split("-", 3);

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int days = Integer.parseInt(arr[2]);

        int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            monthDays[1]++;

        int ans = 0;
        for (int i = 0; i < month - 1; i++) {
            ans += monthDays[i];
        }

        return ans + days;
    }

    public int dayOfYearII(String date) {

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = 0;
        for (int i = 0; i < 4; ++i)
            year = year * 10 + date.charAt(i) - '0';

        int month = date.charAt(5) * 10 + date.charAt(6) - 528;
        int day = date.charAt(8) * 10 + date.charAt(9) - 528;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            monthDays[1]++;

        int ans = 0;
        for (int i = 1; i < month; i++)
            ans += monthDays[i - 1];

        ans += day;
        return ans;
    }
}
