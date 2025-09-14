public class FourteenSeptember {

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;

    public static void addNode(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void print() {
        ListNode temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void deleteNode(int value) {
        ListNode temp = head;

        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }


        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {

        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);

        System.out.println("Before deletion:");
        print();

        deleteNode(20);

        System.out.println("After deletion of 20:");
        print();
    }
}
