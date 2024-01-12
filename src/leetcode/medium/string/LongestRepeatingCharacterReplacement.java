package leetcode.medium.string;

/**
 * {@link <a href="https://leetcode.com/problems/longest-repeating-character-replacement/">424. Longest Repeating Character Replacement</a>}.
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        char[] chars = new char[26];
        int start = 0, end = 0, max = 0, tempMax = 0;

        while (end < s.length()) {

            tempMax = Math.max(tempMax, ++chars[s.charAt(end) - 'A']);

            while (end - start + 1 - tempMax - k > 0) {
                chars[s.charAt(start) - 'A']--;
                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;

        }
        return max;
    }
}
