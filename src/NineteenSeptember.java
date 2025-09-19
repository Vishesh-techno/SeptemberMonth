public class NineteenSeptember {
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

    public static void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode removeNthNodeFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        int sz = 0;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        if (sz < n) {
            return head;
        }
        if(sz == n){
            return head.next;
        }
        int i = 0;
        int j = sz - n;
        ListNode prev = head;
        while (i < j - 1) {
            i++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }


    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);
        addNode(60);
        addNode(50);
        addNode(60);

        print();

        removeNthNodeFromEnd(head, 3);

        print();
    }
}
