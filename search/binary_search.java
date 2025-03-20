package search;

public class binary_search {

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 6, 8, 10, 11 };
        int target = 11;

        int result1 = binarySearch(nums, target);
        int result2 = searchRecursively(nums, target, 0, nums.length - 1);

        if (result1 != -1) {
            System.out.println("Element found at index : " + result1);
            System.out.println("Element found using recursion : " + result2);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                steps++;
                System.out.println("Steps taken : " + steps);
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // Binary search using recursive function
    private static int searchRecursively(int[] nums, int target, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return searchRecursively(nums, target, left, mid - 1);
            } else {
                return searchRecursively(nums, target, mid + 1, right);
            }
        }
        return -1;
    }
}
