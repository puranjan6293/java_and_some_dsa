package LeetCode_solution;

public class Remove_Duplicates_from__LinkedList {
    /*
    public ListNode deleteDuplicates(ListNode head) {

        //Approach1
        ListNode start = new ListNode(0, head);
        ListNode prev = start;
        ListNode curr = head;

        //traversing
        while(curr!=null && curr.next!=null){
            //checking
            if(curr.val == curr.next.val){
                while(curr!=null && curr.next!=null && curr.val==curr.next.val){
                    curr.next = curr.next.next;
                }
                prev.next = curr.next;
                curr = prev.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return start.next;
        //


        //Approach2
        // Special case...
        if (head == null || head.next == null)
            return head;
        // create a fake node that acts like a fake head of list pointing to the original head and it points to the original head......
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode curr = fake;
        // Loop till curr.next and curr.next.next not null
        while(curr.next != null && curr.next.next != null){  // curr.next means the next node of curr pointer and curr.next.next means the next of next of curr pointer...
            // if the value of curr.next and curr.next.next is same...
            // There is a duplicate value present in the list...
            if(curr.next.val == curr.next.next.val) {
                int duplicate = curr.next.val;
                // If the next node of curr is not null and its value is eual to the duplicate value...
                while(curr.next !=null && curr.next.val == duplicate) {
                    // Skip those element and keep updating curr...
                    curr.next = curr.next.next;
                }
            }
            // Otherwise, move curr forward...
            else{
                curr = curr.next;
            }
        }
        return fake.next; // Return the linked list...
    }

     */
}
