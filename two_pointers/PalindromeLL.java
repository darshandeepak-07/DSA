package two_pointers;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
}

public class PalindromeLL {
    
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            if (!arr.get(l).equals(arr.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
