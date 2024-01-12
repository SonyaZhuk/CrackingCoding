package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/arranging-coins/">441. Arranging Coins</a>}.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {

        int counter = 0;
        int index = 1;

        while (n > 0) {
            n = n - index;
            index++;
            if (n >= 0) counter++;
        }
        return counter;
    }

    public int arrangeCoinsI(int n) {
        int i = 1;
        while (n > 0) {
            i++;
            n = n - i;
        }
        return i - 1;
    }

    public int arrangeCoinsII(int n) {
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }

    public int arrangeCoinsIII(int n) {
        return (int) (-1 + (Math.sqrt(1 + 8 * (long) n))) / 2;
    }
}
