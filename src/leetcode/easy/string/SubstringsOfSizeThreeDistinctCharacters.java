package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/">1876. Substrings of Size Three with Distinct Characters</a>}.
 */
public class SubstringsOfSizeThreeDistinctCharacters {

    // Input: s = "xyzzaz"
    // Output: 1
    public int countGoodSubstrings(String s) {

        char[] arr = s.toCharArray();

        int counter = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] != arr[i + 1] && arr[i] != arr[i + 2] && arr[i + 1] != arr[i + 2]) counter++;
        }

        return counter;
    }
}
