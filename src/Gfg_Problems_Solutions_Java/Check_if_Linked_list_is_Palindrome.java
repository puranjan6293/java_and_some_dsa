package Gfg_Problems_Solutions_Java;

public class Check_if_Linked_list_is_Palindrome {
    /*
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head)
    {
        //Your code here
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        // System.out.println(slow.val);
        Node curr=slow.next;
        Node prev=null;
        Node temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        slow.next=prev;
        while(prev!=null){
            if(head.data!=prev.data)
                return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
     */
}
