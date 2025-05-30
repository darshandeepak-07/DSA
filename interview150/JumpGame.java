package interview150;

public class JumpGame {

    // Level 1
    public static boolean canJump(int[] nums) {
        int reachableIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachableIndex) return false;

            reachableIndex = Math.max(reachableIndex, i + nums[i]);
        }
        return true;
    }

    // Level 2
    public static int jump(int[] nums) {
        int res = 0, l = 0, r = 0;

        while (r < nums.length - 1) {
            int farthest = 0;

            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            l = r + 1;
            r = farthest;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}
