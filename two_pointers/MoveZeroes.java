package two_pointers;

public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        int l = 0 ;
        for(int r = 0; r<nums.length ; r++) {
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
        for(int i = 0; i< nums.length ; i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1};
        moveZeroes(nums);
    }
}
