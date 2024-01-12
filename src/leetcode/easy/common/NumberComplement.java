package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/number-complement/">476. Number Complement</a>}.
 */
public class NumberComplement {

    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            char c = (ch == '0') ? '1' : '0';
            sb.append(c);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public int findComplementI(int num) {
        if (num == 0) return 1;

        int mask = 0, temp = num;
        while (num != 0) {
            mask = mask << 1;
            mask = mask | 1;
            num = num >> 1;
        }
        return (~temp) & mask;
    }

    public int findComplementII(int num) {
        var nBits = (int) Math.floor((Math.log(num) / Math.log(2)) + 1);
        var mask = (1 << nBits) - 1;
        return ~num & mask;
    }
}
