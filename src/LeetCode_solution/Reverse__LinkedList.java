package LeetCode_solution;

public class Reverse__LinkedList {
    /*
    public ListNode reverseList(ListNode head) {
        //Recursive approach
        if(head==null || head.next==null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;


        //Itrative Approach
        if(head==null || head.next==null) return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

     */

}
