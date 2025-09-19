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

    public static void print(ListNode head) {
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
        if (sz == n) {
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

    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode(0);

        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }
        if (l2 == null) {
            curr.next = l1;
        } else {
            curr.next = l2;
        }
        return dummy.next;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode left = head;
        ListNode right = prev;
        while (left != null && right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // First sorted list
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        print(l1);

        // Second sorted list
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        print(l2);

        // Merge both lists
        ListNode merged = mergeTwoList(l1, l2);

        // Print merged list
        ListNode temp = merged;
        while (temp != null) {
            System.out.print(temp.data + "==>>");
            temp = temp.next;
        }
        System.out.println("null");

        if (isPalindrome(merged)) {
            System.out.println("Yes, Merged List is Palindrome");
        } else {
            System.out.println("No, Merged List is Not a Palindrome");
        }

        if (isCycle(merged)) {
            System.out.println("Yes, Merged List is Cyclic");
        } else {
            System.out.println("No, Merged List is Not a Cyclic");
        }
    }

}
