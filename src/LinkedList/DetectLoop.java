package LinkedList;

public class DetectLoop {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public boolean detectLoop(Node head) {
        // code here
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // loop detected
            }
        }

        return false;

    }
    public static void main(String[] args) {

    }
}
