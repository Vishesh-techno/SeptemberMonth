public class TwentySixSeptember {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head;

    public static ListNode addNode(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "==>>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);

        while (curr != null) {
            ListNode p = dummy;
            ListNode c = dummy.next;

            while (c != null && c.val <= curr.val) {
                p = p.next;
                c = c.next;
            }

            ListNode next = curr.next;
            curr.next = p.next;
            p.next = curr;
            curr = next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {


    }
}
