package leetcode.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/">1160. Find Words That Can Be Formed by Characters</a>}.
 */
public class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {

        final Map<Character, Integer> charsMap = new HashMap<>();

        for (char ch : chars.toCharArray()) {
            charsMap.put(ch, charsMap.getOrDefault(ch, 0) + 1);
        }

        int res = 0;

        for (String word : words) {

            final Map<Character, Integer> wordMap = new HashMap<>();
            for (char ch : word.toCharArray()) {
                wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
            }

            int len = word.length();

            int i = 0;
            for (i = 0; i < len; i++) {
                char ch = word.charAt(i);
                if (charsMap.get(ch) == null || charsMap.get(ch) < wordMap.get(ch)) break;
            }

            if (i == len) res += len;
        }

        return res;
    }

    public int countCharactersI(String[] words, String chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length(); i++)
            counts[chars.charAt(i) - 'a']++;

        int res = 0;
        for (String s : words) {
            if (canForm(s, counts))
                res += s.length();
        }
        return res;
    }
    private boolean canForm(String word, int[] counts) {
        int[] c = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int x = word.charAt(i) - 'a';
            c[x]++;
            if (c[x] > counts[x])
                return false;
        }
        return true;
    }
}
