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

    // Add node at the end
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

    // Print the linked list
    public static void print() {
        ListNode temp = head;

        while (temp != null) {   // fixed condition
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete node by value
    public static void deleteNode(int value) {
        if (head == null) return;

        if (head.data == value) {   // if head itself needs to be deleted
            head = head.next;
            return;
        }

        ListNode temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {   // skip the node
            temp.next = temp.next.next;
        }
    }

    // Remove nth node from the end (optimized two-pointer method)
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) return head;  // in case n > size
            fast = fast.next;
        }

        // Move both until fast reaches end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip nth node
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);

        System.out.println("Original List:");
        print();

        deleteNode(20);
        System.out.println("After deleting 20:");
        print();

        head = removeNthFromEnd(head, 2);  // remove 2nd from end (30)
        System.out.println("After removing 2nd node from end:");
        print();
    }
}
