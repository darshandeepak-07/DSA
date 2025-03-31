package strivers;

import java.util.Arrays;

public class MostFreq {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 0, total = 0, res = 0;

        while (r < nums.length) {
            total += nums[r];

            while (nums[r] * (r - l + 1) > (total + k)) {
                total -= nums[l];
                l += 1;
            }
            res = Math.max(res, (r - l + 1));
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 2, 4};
        int k = 2;
        System.out.println(maxFrequency(nums, k));
    }
}