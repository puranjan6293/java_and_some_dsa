package Gfg_Problems_Solutions_Java;

public class Add_two_Numbers_represented_by_linkedList {
    /*
    //Function to add two numbers represented by linked list.
    //step0--> for reversal
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        //step1
        Node l1 = reverse(first);
        Node l2 = reverse(second);

        Node ans = new Node(0);
        Node temp = ans;
        int carry = 0;
        //step2
        while(l1!=null || l2!=null || carry!=0){
            int sum = 0;

            if(l1!=null){
                sum+=l1.data;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2 = l2.next;
            }

            sum+=carry;
            carry = sum/10;

            Node newNode = new Node(sum%10);

            temp.next = newNode;
            temp = temp.next;
        }

        //step3
        return reverse(ans.next);
    }
     */
}
