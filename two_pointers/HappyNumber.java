package two_pointers;

public class HappyNumber {

    static int findSqureSum(int n){
        int sum = 0;
        while(n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
       int slow = n;
       int fast = findSqureSum(n);

       while (fast != 1 && slow != fast) {
        slow = findSqureSum(slow);
        fast = findSqureSum(findSqureSum(fast));
       }
       return fast == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
