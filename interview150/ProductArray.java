package interview150;

import java.util.Arrays;

public class ProductArray {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
