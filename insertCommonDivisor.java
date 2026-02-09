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

public class insertCommonDivisor {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        System.out.println("Before:");
        printList(list1);
        ListNode ne = insertGreatestCommonDivisors(list1);
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
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode newnode = head;
        while(newnode.next!=null){
            ListNode node = new ListNode();
            int num1 = newnode.val;
            int num2 = newnode.next.val;
            node.val = findGCD(num1,num2);
            node.next = newnode.next;
            newnode.next = node;
            newnode = node.next;
        }
        return head;
    }
    public static int findGCD(int a, int b) {
    if (b == 0)
        return a;
    return findGCD(b, a % b);
    }
}
