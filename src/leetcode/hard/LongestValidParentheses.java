package leetcode.hard;

import java.util.Stack;

/**
 * {@link <a href="https://leetcode.com/problems/longest-valid-parentheses/">32. Longest Valid Parentheses</a>}.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int res = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') c += 1;
            else if (c > 0) {
                dp[i] = dp[i - 1] + 2;
                dp[i] += (i - dp[i]) >= 0 ? dp[i - dp[i]] : 0;
                res = Math.max(res, dp[i]);
                c -= 1;
            }
        }

        return res;
    }

    public int longestValidParenthesesI(String s) {
        int n = s.length();
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }

        return ans;
    }
}
