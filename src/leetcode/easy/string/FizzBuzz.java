package leetcode.easy.string;

import java.util.ArrayList;
import java.util.List;


/**
 * {@link <a href="https://leetcode.com/problems/fizz-buzz/submissions/">412. Fizz Buzz</a>}.
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
