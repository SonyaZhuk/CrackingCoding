package leetcode.medium.classdesign;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link <a href="https://leetcode.com/problems/design-add-and-search-words-data-structure/">211. Design Add and Search Words Data Structure</a>}.
 */
public class WordDictionary {
    private List<String> words;

    public WordDictionary() {
        words = new ArrayList<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        for (String w: words) {
            if (isMatches(w, word)) return true;
        }
        return false;
    }

    private boolean isMatches(String w, String word) {
        if (w.length() != word.length()) {
            return false;
        }
        for (int i = 0; i < w.length(); i++) {
            if (word.charAt(i) != '.' && word.charAt(i) != w.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
