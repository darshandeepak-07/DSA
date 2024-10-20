package two_pointers;

public class ReverseWords3 {
    
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0,right = 0;

        for(int i = 0; i < chars.length ; i++) {
            boolean isLast = i == chars.length - 1;
            if(chars[i] == ' ' || i == chars.length - 1) {
                if(!isLast) {
                    right = i - 1;
                } else {
                    right = i;
                }
                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}