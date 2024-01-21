package LinkedList;
import java.util.HashSet;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hset = new HashSet<>();
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode previous = dummy;
        ListNode current = head;

        while (current != null) {
            if (hset.contains(current.val)) {
                previous.next = current.next;
            } else {
                hset.add(current.val);
                previous = current;
            }
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        RemoveDuplicates solution = new RemoveDuplicates();
        head = solution.deleteDuplicates(head);

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}