package two_pointers;

/**
 * ReverseVowels
 */
public class ReverseVowels {

    static boolean isVowelPresent(char a) {
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i = 0; i < vowels.length ; i++) {
            if(a == vowels[i]){
                return true;
            }
        }
        return false;
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            if (isVowelPresent(chars[l]) && isVowelPresent(chars[r])) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
            if (!isVowelPresent(chars[l])) {
                l++;
            }
            if (!isVowelPresent(chars[r])) {
                r--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        reverseVowels(s);
    }
}