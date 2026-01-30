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

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
         head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        System.out.println("Before:");
        printList(head);
        head = deleteDuplicates(head);
        System.out.println("After:");
        printList(head);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newnode = new ListNode(111);
        newnode.next = head;
        while(newnode!=null&&newnode.next!=null){
            if(newnode.val==newnode.next.val){
                newnode.next = newnode.next.next;
            }
            else
                newnode = newnode.next;
        }
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
