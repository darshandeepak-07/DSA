package sort;

public class insertion_sort {

    // recursively sort using insertion sort
    public static void insertionSort(int nums[], int i, int n) {
        if (i == n) return;

        int key = nums[i];
        int j = i - 1;

        while (j >= 0 && nums[j] > key) {
            nums[j + 1] = nums[j];
            j--;
        }

        nums[j + 1] = key;

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]);
        }
        System.out.println();
        insertionSort(nums, i + 1, n);
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 2, 7, 3, 10, 5};

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }

        insertionSort(nums, 0, nums.length);
    }
}
