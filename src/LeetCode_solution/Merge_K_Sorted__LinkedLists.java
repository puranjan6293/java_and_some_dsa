package LeetCode_solution;

public class Merge_K_Sorted__LinkedLists {
    /*
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<k;i++){
            ListNode curr = lists[i];
            while(curr!=null){
                ans.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(ans);
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        for(int i:ans){
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        return head.next;
    }

     */
}
