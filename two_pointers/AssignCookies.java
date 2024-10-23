package two_pointers;

import java.util.Arrays;;

public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p1 = 0, p2 = 0, satisfiedCount = 0;

        while(p1 < g.length && p2 < s.length) {
            if(s[p2] >= g[p1]) {
                satisfiedCount++;
                p2++;
            }
            p1++;
        }
        return satisfiedCount;
    }
    
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
