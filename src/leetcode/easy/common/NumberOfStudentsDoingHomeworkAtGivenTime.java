package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/>1450. Number of Students Doing Homework at a Given Time</a>}.
 */
public class NumberOfStudentsDoingHomeworkAtGivenTime {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) count++;
        }
        return count;
    }
}
