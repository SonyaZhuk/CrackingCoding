package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/">1784. Check if Binary String Has at Most One Segment of Ones</a>}.
 */
public class CheckIfBinaryStringHasMostOneSegment {

    // Input: s = "1001"
    // Output: false
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}