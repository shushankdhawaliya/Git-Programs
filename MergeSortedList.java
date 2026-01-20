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
public class MergeSortedList {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = new ListNode(5);

        System.out.println("Before:");
        printList(list1);
        printList(list2);
        ListNode ne = mergeTwoLists(list1,list2);
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
    public  static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
       ListNode head = null;
        if(list1==null&&list2==null){
            return head;
        }
        ListNode curr = null;
        while(list1!=null&&list2!=null){
            ListNode newnode;
            if(list1.val<=list2.val){
               newnode=list1;
               list1 = list1.next;
            }
            else{
                newnode = list2;
               list2 = list2.next;   
            }
            if(head==null){
                head = newnode;
                curr = head;
            }
            else{
                curr.next = newnode;
                curr = curr.next;
            }
            
        }
        if(list1!=null){
                curr.next = list1;
            }
        if(list2!=null){
                curr.next = list2;
            }
        return head;
    }
}
