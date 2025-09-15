public class FifteenSeptember {
    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static ListNode head1;
    public static ListNode head2;

    // add node
    public static ListNode addNode(ListNode head, int data) {
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

        return head; // return updated head
    }

    // print list
    public static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // reverse list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // merge two sorted lists
    public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummyNode.next;
    }

    public static void main(String[] args) {

        head1 = addNode(head1, 10);
        head1 = addNode(head1, 20);
        head1 = addNode(head1, 30);

        head2 = addNode(head2, 15);
        head2 = addNode(head2, 25);
        head2 = addNode(head2, 35);
        head2 = addNode(head2, 45);

        System.out.print("List 1:");
        print(head1);
        System.out.println();
        System.out.print("List 2:");
        print(head2);

        System.out.println();

        // Reverse List 1
        head1 = reverseList(head1);
        System.out.print("Reversed List 1: ");
        print(head1);

        // Reverse List 2
        head2 = reverseList(head2);
        System.out.print("Reversed List 2: ");
        print(head2);
        System.out.println();


        head1 = reverseList(head1);
        head2 = reverseList(head2);
        ListNode mergedHead = mergeTwoSortedList(head1, head2);
        System.out.print("Merged List:");
        print(mergedHead);

        System.out.println();


        ListNode reversedHead = reverseList(mergedHead);
        System.out.print("Reversed Merged List:");
        print(reversedHead);
    }
}
