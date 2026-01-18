package LinkedList;

public class RemoveLooPInLL {

    class Node
    {
        int data;
        Node next;
    }
    public static void removeLoop(Node head) {
        if(head==null && head.next==null) return;
        Node slow = head, fast = head;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        // No loop
        if (slow != fast) return;

        // Step 2: Remove loop
        slow = head;

        // Special case: loop starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        // General case
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
    }
    public static void main(String[] args) {

    }
}
