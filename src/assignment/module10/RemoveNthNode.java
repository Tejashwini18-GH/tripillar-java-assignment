package assignment.module10;

// LeetCode 19 - Remove Nth Node From End
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RemoveNthNode {
    public static ListNode3 removeNthFromEnd(ListNode3 head, int n) {
        ListNode3 dummy = new ListNode3(0);
        dummy.next = head;
        ListNode3 first = dummy;
        ListNode3 second = dummy;
        for (int i = 0; i <= n; i++)
            first = first.next;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
    public static void printList(ListNode3 head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode3 head = new ListNode3(1);
        head.next = new ListNode3(2);
        head.next.next = new ListNode3(3);
        head.next.next.next = new ListNode3(4);
        head = removeNthFromEnd(head, 2);
        printList(head);
    }
}
