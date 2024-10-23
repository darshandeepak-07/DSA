package two_pointers;

public class ReverseString2 {
    
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for(int i = 0;i<chars.length - 1;i+=(2*k)) {
           int left = i;
           int right = Math.min(i + k - 1 , chars.length -1);
           while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
           }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}