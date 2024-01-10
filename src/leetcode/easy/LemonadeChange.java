package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/lemonade-change/">860. Lemonade Change</a>}.
 */
public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int counterFives = 0;
        int counterTens = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) counterFives++;

            else if (bills[i] == 10) {
                if (counterFives == 0) return false;
                counterTens++;
                counterFives--;
            } else {
                if (counterFives >= 1 && counterTens >= 1) {
                    counterFives--;
                    counterTens--;
                } else if (counterFives >= 3) {
                    counterFives -= 3;
                } else return false;

            }
        }
        return true;
    }
}
