package recursion;

public class Basic {
    
    // To print N numbers using recursion
    public static void printN(int i,int n) {
        if (i == n) {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printN(++i,n);
    }

    public static void printNames(int n,String name) {
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printNames(--n, name);
    }

    static int sumN(int sum,int n) {
        if(n == 0 ){
            return sum;
        }
        sum += n;
        return sumN(sum,--n);
    }
    public static void main(String[] args) {
        printN(1,5);
        printNames(5, "Deepak");
        int sum = sumN(0, 5);
        System.out.println(sum);
    }
}
