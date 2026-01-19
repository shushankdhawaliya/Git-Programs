class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Before:");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.println("After:");
        printList(head);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        ListNode curr = head;
        int i = 1;

        while (i <= n && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            return head.next;
        }

        while (temp.next != null) {
            temp = temp.next;
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        
        System.out.println("null");
    }
}