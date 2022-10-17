package LeetCode_solution;

public class Remove_Nth_Node_from_the_end_of__LinkedList {
    /*
    //approach1
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start, fast = start;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
    */
    /*
    //Approach2
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //base case, if there is only one node is present
        if(head.next==null){
            return null;
        }

        //traverse
        int size=0;
        ListNode curr = head;
        while(curr!=null){
            curr =curr.next;
            size++;
        }

        //we found the n
        if(n==size){
            return head.next;
        }

        //previous of n
        int prevOfN = size-n;
        ListNode prev = head;
        int i = 1;
        while(i<prevOfN){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

     */
}
