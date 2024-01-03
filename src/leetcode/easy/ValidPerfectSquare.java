package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/valid-perfect-square/">367. Valid Perfect Square</a>}.
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;

        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) return true;
            else if (mid < num / mid) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
