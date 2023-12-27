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
            } else {
                if (stack.isEmpty() || stack.pop() != ch) return false;
            }
        }

        return stack.isEmpty();
    }

    public boolean isValidI(String s) {

        char[] arr = s.toCharArray();

        if (arr.length == 0 || arr.length % 2 != 0) return false;

        for (int i = 0; i < arr.length - 1; i += 2) {
            switch (arr[i]) {
                case ('('):
                    if (arr[i + 1] != ')') return false;
                    else break;

                case ('{'):
                    if (arr[i + 1] != '}') return false;
                    else break;

                case ('['):
                    if (arr[i + 1] != ']') return false;
                    else break;

                default:
                    return false;
            }
        }
        return true;
    }
}
