package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/>1437. Check If All 1's Are at Least Length K Places Away</a>}.
 */
public class CheckIfAllFirstAreAtLeastLengthKPlacesAway {

    public boolean kLengthApart(int[] nums, int k) {
        int c = 0;
        if (nums[0] == 0) c = k;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (c < k) return false;
                c = 0;
            } else c++;
        }

        return true;
    }
}
