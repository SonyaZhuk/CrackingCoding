package leetcode.easy.common;

import java.time.LocalDate;

/**
 * {@link <a href="https://leetcode.com/problems/day-of-the-week/">1185. Day of the Week</a>}.
 */
public class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        final String[] dayOfWeek = new String[] {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};
        final LocalDate localDate = LocalDate.of(year, month, day);
        int n = localDate.getDayOfWeek().getValue();
        return dayOfWeek[n - 1];
    }
}
