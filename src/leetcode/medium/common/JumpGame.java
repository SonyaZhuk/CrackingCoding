package leetcode.medium.common;

/**
 * {@link <a href="https://leetcode.com/problems/jump-game/>55. Jump Game</a>}.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > index) return false;
            index = Math.max(index, i + nums[i]);
        }

        return true;
    }
}
