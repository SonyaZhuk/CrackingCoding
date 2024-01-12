package leetcode.easy.common;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>}.
 */
public class RomanToInteger {
    private Map<Character, Integer> map = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {

        if (s.isBlank()) return -1;

        int res = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int val = map.get(s.charAt(i));

            if (val < map.get(s.charAt(i + 1))) res -= val;
            else res += val;
        }

        return res;
    }
}
