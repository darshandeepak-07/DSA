package sort;

public class bubble_sort {

    // using recursion

    public static void bubbleSort(int arr[], int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i] ^ arr[i + 1];
                arr[i + 1] = arr[i] ^ arr[i + 1];
                arr[i] = arr[i] ^ arr[i + 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 5, 7, 4, 8, 6, 3, 10};
        int size = nums.length - 1;
        int temp = 0;

        System.out.println("Before sorting : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting : ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }

        bubbleSort(nums, nums.length);
    }
}
