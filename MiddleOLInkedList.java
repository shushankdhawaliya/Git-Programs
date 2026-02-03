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
public class MiddleOLInkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        System.out.println("Before:");
        printList(list1);
        ListNode ne = middleNode(list1);
        printList(ne);
        
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        
        System.out.println("null");
    }

    
    public static ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        int size=0;
        ListNode curr;
        curr= head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        curr=head;
        System.out.println(size/2);
        for(int i=0;i<size/2;i++){
            curr=curr.next;
        }
        
        return curr;
    }
}
