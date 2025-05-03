package interview150;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityElement = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) majorityElement = nums[i];

            if (majorityElement == nums[i]) count++;
            else count -= 1;
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
