package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArr {

    // Level 1
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        if(nums1.length < nums2.length) {
            int[] tempArr = nums1;
            nums1 = nums2;
            nums2 = tempArr;
        }
        Set<Integer> allNumbers = new HashSet<>();
        Set<Integer> intersectIntegers = new HashSet<>();
        for(int num : nums1) {
            allNumbers.add(num);
        }

        for(int num : nums2) {
            if(allNumbers.contains(num)) {
                intersectIntegers.add(num);
            }
        }
        return intersectIntegers.stream().mapToInt(num -> num).toArray();
    }

    //Level 2
    public int[] intersect(int[] nums1, int[] nums2) {
         int p1 = 0, p2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                result.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return result.stream().mapToInt(num -> num).toArray();
    }
    
    public static void main(String[] args) {
        
    }
}
