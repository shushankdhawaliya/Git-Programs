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

public class RotateList {
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        
        System.out.println("null");
    }

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
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: find length
        ListNode curr = head;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Step 2: reduce rotations
        k = k % length;
        if (k == 0) return head;

        // Step 3: make circular
        curr.next = head;

        // Step 4: find new tail
        int steps = length - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 5: break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

}
