package sort;

public class selection_sort {
    public static void main(String[] args) {
        int nums[] = { 3, 1, 5, 6, 10, 12, 15, 2 };
        int minIndex = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
    }
}
