package LinkedList;

public class SortList0_1_6 {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public Node segregate(Node head) {
    int count0 = 0, count1 = 0, count2 = 0;
    Node curr = head;

    // Step 1: Count 0s, 1s, 2s
    while(curr !=null)

    {
        if (curr.data == 0) count0++;
        else if (curr.data == 1) count1++;
        else count2++;
        curr = curr.next;
    }

    // Step 2: Overwrite values
    curr =head;

    while(count0-->0)

    {
        curr.data = 0;
        curr = curr.next;
    }

    while(count1-->0)

    {
        curr.data = 1;
        curr = curr.next;
    }

    while(count2-->0)

    {
        curr.data = 2;
        curr = curr.next;
    }
//    public Node segregate(Node head) {
//    Node evenDummy = new Node(0);
//    Node oddDummy = new Node(0);
//
//    Node even = evenDummy;
//    Node odd = oddDummy;
//
//    Node curr = head;
//
//    while(curr !=null)
//
//    {
//        if (curr.data % 2 == 0) {
//            even.next = curr;
//            even = even.next;
//        } else {
//            odd.next = curr;
//            odd = odd.next;
//        }
//        curr = curr.next;
//    }
//
//    // connect even list with odd list
//    even.next =oddDummy.next;
//    odd.next =null;
//
//    return evenDummy.next;


return head;
}

    public static void main(String[] args) {

    }
}
