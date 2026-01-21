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
public class SwapTwoNodesInPairs {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        System.out.println("Before:");
        printList(list1);
        ListNode ne = swapPairs(list1);
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

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next ==null)
            return head;
        ListNode curr,next,pre; 
         pre = null;
         curr = head;
         next = head.next;
         head = next;
        while(curr!=null&&curr.next!=null){
                curr.next = next.next;
                next.next = curr;     
            if(pre!=null){
                  pre.next = next;         
            }
            pre = curr;
            curr = curr.next;
            if(curr!=null){
                next = curr.next;
            }
        }
        return head;  
    }
}
