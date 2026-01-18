package LinkedList;

import java.util.HashSet;

public class FirstNodeOfLoop {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static int cycleStart(Node head) {
        HashSet<Node> set = new HashSet<>();

        Node currNode = head;

        // Traverse the linked list
        while (currNode != null) {

            // If current node already in set → loop start
            if (set.contains(currNode)) {
                return currNode.data;
            }

            set.add(currNode);

            currNode = currNode.next;
        }

        return -1;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head.next.next.next.next.next = head.next.next;

        int loopNode = cycleStart(head);

        if (loopNode != -1)
            System.out.println(loopNode);
        else
            System.out.println(-1);
    }
}
