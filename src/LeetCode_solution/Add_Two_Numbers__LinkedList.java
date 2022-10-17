package LeetCode_solution;

public class Add_Two_Numbers__LinkedList {
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;
        //step2
        while(l1!=null || l2!=null || carry!=0){
            int sum = 0;

            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }

            sum+=carry;
            carry = sum/10;

            ListNode newNode = new ListNode(sum%10);

            temp.next = newNode;
            temp = temp.next;
        }

        //step3
        return ans.next;
    }

     */
}
