public class TwentySeptember {
    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
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
            System.out.print(temp.data + "==>>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next != null && temp.next.data == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        print(l1);

        removeElements(l1, 3);
        print(l1);

    }
}
