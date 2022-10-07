package Gfg_Problems_Solutions_Java;

public class find_pair_with_given_sum_in_doublyLinkedList_tp {
    /*
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        while(head.data<last.data){
            int sum = head.data+last.data;
            if(sum==target){

                ArrayList<Integer> arr = new ArrayList<>();
                //adding in new array
                arr.add(head.data);
                arr.add(last.data);
                ans.add(arr);
                //updating
                head = head.next;
                last = last.prev;
            }
            else if(sum<target){
                head = head.next;
            }
            else{
                last = last.prev;
            }
        }
        return ans;
    }

     */
}
