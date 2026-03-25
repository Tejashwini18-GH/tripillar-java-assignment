package assignment.module10;

// LeetCode 876 - Middle of Linked List
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MiddleOfLinkedList {
    public static ListNode2 middleNode(ListNode2 head) {
        ListNode2 slow = head;
        ListNode2 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        ListNode2 mid = middleNode(head);
        System.out.println("Middle: " + mid.val);
    }
}
