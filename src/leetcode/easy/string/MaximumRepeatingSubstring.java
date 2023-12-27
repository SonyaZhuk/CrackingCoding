package leetcode.easy.string;


/**
 * {@link <a href="https://leetcode.com/problems/maximum-repeating-substring/">1668. Maximum Repeating Substring</a>}.
 */
public class MaximumRepeatingSubstring {

    // Input: sequence = "ababc", word = "ab"
    // Output: 2
    public int maxRepeating(String sequence, String word) {
        char[] arr = sequence.toCharArray();
        char[] arr1 = word.toCharArray();
        int res = 0;

        for (int i = 0; i < arr.length - arr1.length + 1; i++) {
            if (arr[i] != arr1[0]) continue;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] != arr[i + j]) break;

                if (j == arr1.length - 1) {
                    res++;
                    i = i + j + 1;
                }
            }
        }
        return res;
    }

    public int maxRepeatingI(String sequence, String word) {
        int c = 0;

        String add = word;
        while (sequence.contains(word)) {
            c += 1;
            word = word + add;
        }
        return c;
    }
}
