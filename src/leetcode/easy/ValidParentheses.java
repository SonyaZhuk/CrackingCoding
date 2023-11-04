package leetcode.easy;

import java.util.Stack;

/**
 * {@link <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>}.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else  {
                if (stack.isEmpty() || stack.pop() != ch) return false;
            }
        }

        return stack.isEmpty();
    }
}
