package two_pointers;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[lastIndex] = nums1[m];
                m--;
            } else {
                nums1[lastIndex] = nums2[n];
                n--;
            }
            lastIndex--;
        }

        while (n >= 0) {
            nums1[lastIndex] = nums2[n];
            n--;
            lastIndex--;
        }
    }
    
    public static void main(String[] args) {
        int[] a1 = {0};
        int[] a2 = {1};
        merge(a1, 0, a2, 1);
    }
}
