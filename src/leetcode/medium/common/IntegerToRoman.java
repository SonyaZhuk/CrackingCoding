package leetcode.medium.common;

import java.util.*;

/**
 * {@link <a href="https://leetcode.com/problems/integer-to-roman/">12. Integer to Roman</a>}.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        final String arrI[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        final String arrX[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        final String arrC[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        final String arrM[] = {"", "M", "MM", "MMM"};

        return arrM[num / 1000] + arrC[(num % 1000) / 100] + arrX[(num % 100) / 10] + arrI[num % 10];
    }

    public String intToRomanI(int num) {
        final Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        final List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());

        final StringBuilder sb = new StringBuilder();
        for (int n : list) {
            while (num >= n) {
                sb.append(map.get(n));
                num -= n;
            }
        }

        return sb.toString();
    }
}
