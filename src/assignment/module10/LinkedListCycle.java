package assignment.module10;

// LeetCode 141 - Linked List Cycle
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}
public class LinkedListCycle {
    public static boolean hasCycle(ListNode1 head) {
        ListNode1 slow = head;
        ListNode1 fast = head;
       while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        ListNode1 second = new ListNode1(2);
        head.next = second;
        second.next = head;
        System.out.println(hasCycle(head));
    }
}
