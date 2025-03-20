package sort;

public class bubble_sort {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 5, 7, 4, 8, 6, 3, 10 };
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
    }
}
