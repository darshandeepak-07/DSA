package two_pointers;

class Rev_Words {
    public static String reverseWords(String s) {
        String result = "";
        int left = s.length();
        int right = left;
    
        while(left <= right && left != -1) {
            if(s.charAt(left - 1) == ' ' || s.charAt(left - 1) == s.charAt(0)) {
                String word = "";
                for(int i = left - 1; i < right; i++) {
                    word += s.charAt(i);
                }
                result += (word + " ");
                right = --left;
            }
            left--;
        }
        return result;
    }
    
    public static void main(String args[]) {
        System.out.println(reverseWords("Deepak Darshan"));
    }
}
