package search;

public class linear_search {

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 6, 8, 10, 11 };
        int target = 11;

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken : " + steps);
                return i;
            }
        }
        return -1;
    }
}
