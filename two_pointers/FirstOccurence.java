package two_pointers;

public class FirstOccurence {

    // 28
    public static int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int res = strStr("mississippi","issip");
        System.out.println(res);
    }
}
