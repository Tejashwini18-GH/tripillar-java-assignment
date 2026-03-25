package assignment.module10;

// LeetCode 2 - Add Two Numbers
class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4(int val) {
        this.val = val;
        this.next = null;
    }
}
public class AddTwoNumbers {
    public static ListNode4 addTwoNumbers(ListNode4 l1, ListNode4 l2) {
        ListNode4 dummy = new ListNode4(0);
        ListNode4 curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode4(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode4 head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // 342
        ListNode4 l1 = new ListNode4(2);
        l1.next = new ListNode4(4);
        l1.next.next = new ListNode4(3);
        // 465
        ListNode4 l2 = new ListNode4(5);
        l2.next = new ListNode4(6);
        l2.next.next = new ListNode4(4);
        ListNode4 result = addTwoNumbers(l1, l2);
        printList(result);
    }
}
