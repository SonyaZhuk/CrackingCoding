package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/happy-number/">202. Happy Number</a>}.
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int square(int num) {
        int ans = 0;

        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }

        return ans;
    }
}
