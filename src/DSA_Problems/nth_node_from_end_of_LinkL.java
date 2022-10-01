package DSA_Problems;

public class nth_node_from_end_of_LinkL {
}
/*
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        // Your code here
        int length = 0;
        Node temp = head;
        if(head==null){
            return 0;
        }
        while(temp != null) {
            temp = temp.next;
            length++;
        }
        if(length<n){
            return -1;
        }
        for(int i=0;i<length-n;i++) {
            head = head.next;
        }
        return head.data;

    }
}

 */

