package array;

import java.util.*;

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

    //Problem 4
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    //Problem 5
    public void moveZeroes(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }

    // Problem 6 - To find union of two array in sorted order
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> set = new TreeSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        return new ArrayList<>(set);

    }

    //Problem 7 - To find missing number
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return expectedSum - sum;
    }

    // Problem 8 - Find max of consecutive occurences of 1
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    // Problem 9 - Find the number which is present only once
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int key = -1;

        for (int num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, ++count);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                key = entry.getKey();
            }
        }

        return key;
    }

    public static void main(String[] args) {

    }
}
