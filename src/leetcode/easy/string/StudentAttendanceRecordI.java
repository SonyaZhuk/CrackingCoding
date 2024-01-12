package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/student-attendance-record-i/">551. Student Attendance Record I</a>}.
 */
public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        //"PPALLL"
        int aCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aCounter++;
                if (aCounter >= 2) return false;
            }

            if (s.charAt(i) == 'L' && i <= s.length() - 3) {
                if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') return false;
            }

        }
        return true;
    }

    public boolean checkRecordI(String s) {
        int a = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') a++;
            if (s.charAt(i) == 'L') l++;
            else l = 0;
            if (a >= 2 || l > 2) return false;
        }
        return true;
    }
}
