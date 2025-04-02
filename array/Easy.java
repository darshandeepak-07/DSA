package array;

import java.util.Arrays;

public class Easy {

    // Problem 1
    public static int largest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Problem 2
    public int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    //Problem 3
    public boolean check(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        for (int shift = 0; shift < nums.length; shift++) {
            if (isRotation(nums, sorted, shift)) {
                return true;
            }
        }
        return false;
    }

    private boolean isRotation(int[] nums, int[] sorted, int shift) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[(i + shift) % n] != sorted[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
