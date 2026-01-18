package LinkedList;

public class RemoveLinkedListEle {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public  static ListNode removeElements(ListNode head, int val) {
        if (head == null)

            return head;

        while (head != null && head.val == val) {

            head = head.next;

            if (head == null) {

                return null;

            }

        }


        ListNode dummyHead = head;

        while (dummyHead.next != null) {

            if (dummyHead.next.val == val) {

                dummyHead.next = dummyHead.next.next;

            } else {

                dummyHead = dummyHead.next;

            }

        }

        return head;

    }

    public static RemoveLinkedListEle.ListNode createList(int[] arr) {
        RemoveLinkedListEle.ListNode dummy = new RemoveLinkedListEle.ListNode(-1);
        RemoveLinkedListEle.ListNode tail = dummy;
        for (int num : arr) {
            tail.next = new RemoveLinkedListEle.ListNode(num);
            tail = tail.next;
        }
        return dummy.next;
    }

    // Print linked list
    public static void printList(RemoveLinkedListEle.ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,6,3,4,5,6};
        int val=6;
       ListNode l1 = createList(arr1);
       ListNode sol=removeElements(l1,val);

        printList(sol);



    }

}
