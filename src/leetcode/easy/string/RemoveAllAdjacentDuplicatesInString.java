package leetcode.easy.string;

import java.util.Stack;


/**
 * {@link <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/">1047. Remove All Adjacent Duplicates In String</a>}.
 */
public class RemoveAllAdjacentDuplicatesInString {

    // Input: s = "abbaca"
    // Output: "ca"
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return String.valueOf(sb.reverse());
    }
}
