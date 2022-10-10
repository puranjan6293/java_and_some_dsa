package Gfg_Problems_Solutions_Java;

public class Recover_a_BST {
    /*
    //Function to fix a given BST where two nodes are swapped.
    Node prev = null;
    Node first = null;
    Node second = null;
    Node mid = null;
    Node correctBST(Node root)
    {
        //code here.
        inOrder(root);
        if(first!=null && second!=null){
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
        else if(first!=null && mid!=null){
            int temp = first.data;
            first.data = mid.data;
            mid.data = temp;
        }
        return root;
    }

    void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null){
                first = prev;
                mid = root;
            }
            else second = root;
        }
        prev = root;
        inOrder(root.right);
    }

     */
}
