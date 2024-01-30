package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/>1576. Replace All ?'s to Avoid Consecutive Repeating Characters</a>}.
 */
public class ReplaceAllWildCardsToAvoidConsecutiveRepeatingCharacters {
    public String modifyString(String s) {
        char arr[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] != '?') continue;
            for (int j = 0; j < 3; j++) {
                if (i > 0 && arr[i - 1] == (char) (j + 'a')) continue;
                if (i < s.length() - 1 && arr[i + 1] == (char) (j + 'a')) continue;
                arr[i] = (char) (j + 'a');
                break;
            }
        }
        return new String(arr);
    }
}
