package sort;

public class selection_sort {
    public static void main(String[] args) {
        int nums[] = { 3, 1, 5, 6, 10, 12, 15, 2 };
        int minIndex = -1;

        // ascending order
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

        int maxIndex = -1;

        // descending order
        for (int i = 0; i < nums.length - 1; i++) {
            maxIndex = i;

            for (int j = i +1 ; j < nums.length - i; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }

            int temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();

    }
}
