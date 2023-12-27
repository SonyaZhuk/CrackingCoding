package leetcode.easy.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * {@link <a href="https://leetcode.com/problems/largest-3-same-digit-number-in-string/">2264. Largest 3-Same-Digit Number in String</a>}.
 */
public class Largest3SameDigitNumberInString {

    // Input: num = "6777133339"
    // Output: "777"
    public String largestGoodInteger(String num) {
        char[] arr = num.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] && arr[i+1] == arr[i+2]) {
                int cur = Character.getNumericValue(arr[i]);
                list.add(cur);
            }
        }

        int max = list.stream().max(Comparator.comparingInt(t -> t)).orElse(-1);

        return (max == -1) ? "" : String.valueOf(max).repeat(3);
    }
}
