package leetcode.medium.tree;

/**
 * {@link <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">208. Implement Trie (Prefix Tree)</a>}.
 */
public class Trie {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean leaf;
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.children[ch - 'a'] == null) {
                TrieNode curr = new TrieNode();
                node.children[ch - 'a'] = curr;
            }
            node = node.children[ch - 'a'];
        }
        node.leaf = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.children[ch - 'a'] == null) return false;
            node = node.children[ch - 'a'];
        }
        return node.leaf;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (node.children[ch - 'a'] == null) return false;
            node = node.children[ch - 'a'];
        }
        return true;
    }
}
