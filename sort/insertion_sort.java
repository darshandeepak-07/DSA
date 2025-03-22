package sort;

public class insertion_sort {

    public static void main(String[] args) {
        int nums[] = { 1, 4, 2, 7, 3, 10, 5 };

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
    }
}
