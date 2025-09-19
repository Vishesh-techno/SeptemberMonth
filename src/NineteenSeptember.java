public class NineteenSeptember {
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode head;

    public static ListNode addNode(int data){
        ListNode newNode = new ListNode(data);

        if(head == null){
            head = newNode;
            return head;
        }

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }


    public static void main(String[] args) {



    }
}
