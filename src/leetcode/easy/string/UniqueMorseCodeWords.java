package leetcode.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/unique-morse-code-words/">804. Unique Morse Code Words</a>}.
 */
public class UniqueMorseCodeWords {
    private HashMap<Character, String> alphabet = new HashMap<>();

    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1) return 1;

        initAlphabet();

        Set<String> transformations = new HashSet<>();
        for (String word : words) {
            StringBuilder transformation = new StringBuilder(alphabet.get(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                transformation.append(alphabet.get(word.charAt(i)));
            }
            transformations.add(transformation.toString());
        }

        return transformations.size();
    }

    private void initAlphabet() {
        final Character[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        final String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for (int i = 0; i < chars.length; i++) {
            alphabet.put(chars[i], morseCode[i]);
        }
    }
}
