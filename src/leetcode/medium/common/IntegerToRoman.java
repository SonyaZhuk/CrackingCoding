package leetcode.medium.common;

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
        final int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        final StringBuilder sb = new StringBuilder();
        for(int i = 0; num > 0; i++) {
            while (num >= val[i]) {
                sb.append(rom[i]);
                num -= val[i];
            }
        }

        return sb.toString();
    }
}
