package interview150;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int reachableIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachableIndex) return false;

            reachableIndex = Math.max(reachableIndex, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
}
