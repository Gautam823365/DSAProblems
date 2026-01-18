package LinkedList;

public class MergeTwoSortedList {
    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        if(list1==null)return list2;
        if (list2==null) return  list1;
        while (list1!=null&& list2!=null){
            if(list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;

            }else {
                tail.next=list2;
                list2=list2.next;

            }
           tail=tail.next;
        if(list1!=null)tail.next=list1;
        if(list2!=null)tail.next=list2;

        }
        return dummy.next;
    }


    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for (int num : arr) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }
        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);

        // Merge
        ListNode merged = mergeTwoLists(l1, l2);

        // Print merged list
        System.out.print("Merged list: ");
        printList(merged);
    }
}
