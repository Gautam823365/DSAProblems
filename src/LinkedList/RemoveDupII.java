package LinkedList;

public class RemoveDupII {

    public class ListNode {

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
    }

    public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy=new ListNode(-1);
    dummy.next=head;

    ListNode prev=dummy;

    while (head!=null){

        if(head.next!=null && head.val==head.next.val){
            int dupVal=head.val;
            while (head!=null&& head.val==dupVal){
                head=head.next;
            }
            prev.next=head;
        }
        else {
            prev=head;
            head=head.next;
        }

    }
        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
