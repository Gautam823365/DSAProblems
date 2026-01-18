package LinkedList;

import static LinkedList.RotateRight.ListNode.rotateRight;

public class RotateRight {
    static class  ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode rotateRight(ListNode head, int k) {
            // edge case
            if (head == null || head.next == null || k == 0) {
                return head;

            }

            // find size
            int size = 0;
            ListNode temp = head;
            ListNode tail = head;

            while (temp != null) {
                tail = temp;
                temp = temp.next;
                size++;

            }
            // reduce k
            k = k % size;
            if (k == 0) {
                return head;
            }

            //make circle
            tail.next = head;
            temp = head;
            // Find the new tail
            // New tail is at position (n - k - 1)
            for (int i = 0; i < size - k - 1; i++) {
                temp = temp.next;
            }
// new head is next of new tail
            head = temp.next;
            temp.next = null;
            return head;


        }
    }

        public static RotateRight.ListNode createList(int[] arr) {
            RotateRight.ListNode dummy = new RotateRight.ListNode(-1);
            RotateRight.ListNode tail = dummy;
            for (int num : arr) {
                tail.next = new RotateRight.ListNode(num);
                tail = tail.next;
            }
            return dummy.next;
        }

        // Print linked list
        public static void printList(RotateRight.ListNode head) {
            while (head != null) {
                System.out.print(head.val);
                if (head.next != null) System.out.print(" -> ");
                head = head.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 3, 4, 5, 6};
        int k = 2;

        ListNode l1 = createList(arr1);
        ListNode result = rotateRight(l1, k);
        printList(result);
    }

}
