package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/maximum-score-after-splitting-a-string/>1422. Maximum Score After Splitting a String</a>}.
 */
public class MaximumScoreAfterSplittingAString {

    public int maxScore(String s) {

        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < s.length() - 1; i++) {
            int score = countScore(s, i);
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

    private int countScore(String s, int index) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i <= index && s.charAt(i) == '0') zeros++;
            else if (i > index && s.charAt(i) == '1') ones++;
        }
        return zeros + ones;
    }

    public int maxScoreI(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }
        int maxScore = 0, zerosLeft = 0, onesRight = ones;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zerosLeft++;
            else onesRight--;

            if (maxScore < zerosLeft + onesRight) maxScore = zerosLeft + onesRight;
        }
        return maxScore;
    }

    public int maxScoreII(String s) {
        int length = s.length();
        int ones = 0;
        int tmpScore = s.charAt(0) == '0' ? 1 : 0;
        int score = tmpScore;
        for (int i = 1; i < length - 1; i++) {
            if (s.charAt(i) == '0') {
                tmpScore++;
            } else {
                ones++;
                tmpScore--;
            }
            if (tmpScore > score) {
                score = tmpScore;
            }
        }
        ones += s.charAt(length - 1) == '1' ? 1 : 0;
        return ones + score;
    }
}
