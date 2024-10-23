package two_pointers;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
}

public class IntersectionTwoLL {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while(nodeA != nodeB) {
            nodeA = (nodeA != null) ? nodeA.next : headB;
            nodeB = (nodeB != null) ? nodeB.next : headA;
        }
        return nodeA;
    }
    
    public static void main(String[] args) {
        
    }
}
