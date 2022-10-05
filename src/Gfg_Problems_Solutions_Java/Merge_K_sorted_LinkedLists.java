package Gfg_Problems_Solutions_Java;

public class Merge_K_sorted_LinkedLists {
    /*
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        //step1
        ArrayList<Integer> ans = new ArrayList<>();
        //step2
        for(int i=0;i<K;i++){
            Node curr = arr[i];
            while(curr!=null){
                ans.add(curr.data);
                curr = curr.next;
            }
        }
        //step3
        Collections.sort(ans);
        Node head = new Node(-1);
        Node tail = head;
        //step4
        for(int i:ans){
            tail.next = new Node(i);
            tail = tail.next;
        }
        //step5
        return head.next;
    }

     */
}
