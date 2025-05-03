package interview150;

public class RotateArray {

//    public static void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int temp[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            temp[(i + k) % n] = nums[i];
//        }
//        for (int i = 0; i < n; i++) {
//            nums[i] = temp[i];
//        }
//    }

    public static void rotate(int[] nums, int k) {
        // First reverse the array
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        // Reverse the first k elements
        left = 0;
        int tempK = k - 1;
        while (left <= tempK) {
            int temp = nums[left];
            nums[left] = nums[tempK];
            nums[tempK] = temp;
            tempK--;
            left++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        // reverse the next k elements
        right = nums.length - 1;
        tempK = k;

        while (tempK < right) {
            int temp = nums[right];
            nums[right] = nums[tempK];
            nums[tempK] = temp;
            right--;
            tempK++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
    }
}
