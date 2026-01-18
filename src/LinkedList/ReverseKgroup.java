package LinkedList;


public class ReverseKgroup {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }


    public Node reverseKGroup(Node head, int k) {
        // code here
        Node temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) return head;
            temp = temp.next;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        // Reverse first k nodes
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Recursive call for remaining list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        // prev becomes new head
        return prev;
    }
    public static void main(String[] args) {

    }
}
