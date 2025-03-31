package sort;

public class quick_sort {


    static int[] quickSort(int arr[], int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 5, 7, 4, 8, 6, 3, 10};
        int res[] = quickSort(nums, 0, nums.length - 1);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
