package two_pointers;

public class CountBinarySS {
    
    public static int findMinimum(int x, int y) {
        return (x < y) ? x : y ;
    }
    public static int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int current = 1;
        int sum = 0;
        int previous = 0;

        for(int i = 1 ; i < chars.length ; i++) {
            if(chars[i] == chars[i - 1]) {
                current++;
            } else {
                sum += findMinimum(previous, current);
                current = 1;
                previous = chars[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110"));
    }
}
