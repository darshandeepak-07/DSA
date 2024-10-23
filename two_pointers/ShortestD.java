package two_pointers;

// 821
public class ShortestD {
    
    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        char[] chars = s.toCharArray();
        int p = -s.length();

        for(int i = 0;i < chars.length; i++) {
            if(chars[i] == c) {
               p = i;
            }
            res[i] = i - p;
        }

        for(int i = chars.length - 1;i>=0;i--){
            if(chars[i] == c) {
                p = i;
            }
            res[i] = Math.min(res[i], p - i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = shortestToChar("loveleetcode", 'e');
        for(int i = 0 ; i < res.length ; i++){
            System.out.println(res[i]);
        }
    }
}
