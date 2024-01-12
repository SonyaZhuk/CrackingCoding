package leetcode.medium.common;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/generate-parentheses/">22. Generate Parentheses</a>}.
 */
public class GenerateParentheses {
    private List<String> res;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();

        generateParenthesis(new StringBuilder(), n, n);

        return res;
    }
    private void generateParenthesis(StringBuilder sb, int open, int close) {
        if (open == 0 && close == 0) {
            res.add(sb.toString());
        }

        if (open > close || open < 0) return;

        generateParenthesis(sb.append('('), open - 1, close);
        sb.deleteCharAt(sb.length() - 1);

        generateParenthesis(sb.append(')'), open, close - 1);
        sb.deleteCharAt(sb.length() - 1);
    }

    //n = 1, (),
    //n = 2, ()(), (())
    //n = 3, ((())), ()()(), (())(), ()(()), (()())
    public void printBrackets(StringBuilder curr, int open, int close, int n) {

        if (curr.length() == 2 * n) {
            System.out.println(curr);
            return;
        }
        if (open < n) {
            curr.append("(");
            printBrackets(curr, open + 1, close, n);
        }
        if (close < n) {
            curr.append(")");
            printBrackets(curr, open, close + 1, n);
        }
    }
}