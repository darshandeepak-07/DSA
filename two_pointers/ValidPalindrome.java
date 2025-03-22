package two_pointers;

public class ValidPalindrome {
    
    public static String removeNonAlphaNumeric(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }

    public boolean isPalindrome(String s) {
            String newString = removeNonAlphaNumeric(s).toLowerCase();
            System.out.println(newString);
            int r = newString.length() - 1 , l =0 ; 
            while (l < r) {
                if(newString.charAt(l) != newString.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
    
        public static void main(String[] args) {
            ValidPalindrome validPalindrome = new ValidPalindrome();
            System.out.println(validPalindrome.isPalindrome("aa"));
    }
}
