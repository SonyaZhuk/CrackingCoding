package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/">2586. Count the Number of Vowel Strings in Range</a>}.
 */
public class CountTheNumberOfVowelStringsInRange {

    public int vowelStrings(String[] words, int left, int right) {
        // words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4

        //'a', 'e', 'i', 'o', and 'u'.
        int counter = 0;

        for (int i = left; i <= right; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) counter++;
        }
        return counter;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
