package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/">2124. Check if All A's Appears Before All B's</a>}.
 */
public class CheckIfAllAAppearsBeforeAllB {

    // Input: s = "abab"
    // Output: false
    public boolean checkString(String s) {
        char[] arr =  s.toCharArray();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == 'b') flag = true;
            if (arr[i] == 'a' && flag) return false;
        }
        return true;
    }
}
