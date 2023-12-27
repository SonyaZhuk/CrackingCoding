package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">387. First Unique Character in a String</a>}.
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        if (s.length() == 1) return 0;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            String tail = s.substring(i + 1);
            String prefix = s.substring(0, i);

            if (!tail.contains(Character.toString(arr[i]))
                    && !prefix.contains(Character.toString(arr[i]))) return i;

        }
        return -1;
    }
}
