package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComp {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int components = 0;
        ListNode current = head;

        while (current != null) {
            // Start of a new component
            if (set.contains(current.val) &&
                    (current.next == null || !set.contains(current.next.val))) {
                components++;
            }
            current = current.next;
        }

        return components;

    }
        public static void main(String[] args) {

    }
}
