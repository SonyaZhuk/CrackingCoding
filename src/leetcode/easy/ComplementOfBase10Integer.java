package leetcode.easy;

/**
 * {@link <a href="https://leetcode.com/problems/complement-of-base-10-integer/">1009. Complement of Base 10 Integer</a>}.
 */
public class ComplementOfBase10Integer {

    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            char c = (ch == '0') ? '1' : '0';
            sb.append(c);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public int findComplementI(int n) {
        if (n == 0) return 1;

        int mask = 0, temp = n;
        while (n != 0) {
            mask = mask << 1;
            mask = mask | 1;
            n = n >> 1;
        }
        return (~temp) & mask;
    }
}
