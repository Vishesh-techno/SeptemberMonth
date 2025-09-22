import java.util.List;

public class TwentyTwoSeptember {
    static class ListNode{
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode pointer = res;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = 0 + carry;

            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum%10;
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
        }
        if(carry == 1){
            pointer.next = new ListNode(1);
        }
        return res.next;
    }

    
    public static void main(String[] args) {
        
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        print(l1);

       ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        print(l2);

        ListNode result = addTwoNumbers(l1, l2);
        print(result);
        
        
    }
}
