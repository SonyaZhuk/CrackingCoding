package leetcode.medium;

/**
 * {@link <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>}.
 */
public class LongestPalindromicSubstring {

    //Brute force
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int len = 0; i + len < arr.length; len++) {
                if (isPalindrome(arr, i, len) && len + 1 > maxLen) {
                    maxLen = len + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    private boolean isPalindrome(char[] charArray, int start, int len) {
        while (len > 0) {
            if (charArray[start] != charArray[start + len]) {
                return false;
            }

            start++;
            len -= 2;
        }

        return true;
    }

    //DP, O(2*N) memory
    public String longestPalindromeI(String s) {
        char[] arr = s.toCharArray();

        int n = s.length();
        boolean[][] dp = new boolean[n][2];

        int currCol = 0;
        int maxLen = 0;
        int index = 0;

        for (int len = 0; len < n; len++) {
            for (int start = 0; start + len < n; start++) {
                int end = start + len;
                if (len == 0) {
                    dp[start][currCol] = true;
                } else if (len == 1) {
                    dp[start][currCol] = (arr[start] == arr[end]);
                } else {
                    dp[start][currCol] = (arr[start] == arr[end] && dp[start + 1][currCol]);
                }

                if (dp[start][currCol] && len + 1 > maxLen) {
                    index = start;
                    maxLen = len + 1;
                }
            }
            currCol = 1 - currCol;
        }

        return maxLen == 0 ? "" : s.substring(index, index + maxLen);
    }

    public String longestPalindromeII(String s) {
        if (s.length() == 0) {
            return "";
        }

        char[] arr = s.toCharArray();

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            int len = Math.max(expand(arr, i, i), expand(arr, i, i + 1));

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);

    }

    private int expand(char[] sChars, int i, int j) {
        while (i >= 0 && j < sChars.length && sChars[i] == sChars[j]) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    // Manacher's algorithm, Time complexity: O(n), Space complexity: O(n)
    public String longestPalindromeIII(String s) {
        int len = 2 * s.length() + 3;
        char[] arr = new char[len];

        /*
         * To ignore special cases at the beginning and end of the array
         * "abc" -> @ # a # b # c # $
         * "" -> @#$
         * "a" -> @ # a # $
         */
        arr[0] = '@';
        arr[len - 1] = '$';
        int t = 1;
        for (char c : s.toCharArray()) {
            arr[t++] = '#';
            arr[t++] = c;
        }
        arr[t] = '#';

        int maxLen = 0;
        int start = 0;
        int maxRight = 0;
        int center = 0;
        int[] p = new int[len]; // i's radius, which not includes i
        for (int i = 1; i < len - 1; i++) {
            if (i < maxRight) {
                p[i] = Math.min(maxRight - i, p[2 * center - i]);
            }

            // expand center
            while (arr[i + p[i] + 1] == arr[i - p[i] - 1]) {
                p[i]++;
            }

            // update center and its bound
            if (i + p[i] > maxRight) {
                center = i;
                maxRight = i + p[i];
            }

            // update ans
            if (p[i] > maxLen) {
                start = (i - p[i] - 1) / 2;
                maxLen = p[i];
            }
        }

        return s.substring(start, start + maxLen);
    }
}
