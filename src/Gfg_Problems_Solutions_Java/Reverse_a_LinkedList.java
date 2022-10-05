package Gfg_Problems_Solutions_Java;

public class Reverse_a_LinkedList {
    /*
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // Recursive approach
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

     */

        /*
        //Iterative approach
        if(head==null || head.next==null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;

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
