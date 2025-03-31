package two_pointers;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
     }
}

public class IntersectionTwoLL {

    public ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {
        ListNode1 nodeA = headA;
        ListNode1 nodeB = headB;

        while(nodeA != nodeB) {
            nodeA = (nodeA != null) ? nodeA.next : headB;
            nodeB = (nodeB != null) ? nodeB.next : headA;
        }
        return nodeA;
    }
    
    public static void main(String[] args) {
        
    }
}
