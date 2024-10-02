package two_pointers;

public class RemoveElement {
    
    // 27
    public static int removeElement(int[] nums, int val) {
        int l = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[l] = nums[i];
                l++;
            }
        }
        return l ;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int res = removeElement(nums, 3);
        System.out.println(res);
    }
}
