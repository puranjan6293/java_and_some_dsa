package Gfg_Problems_Solutions_Java;

public class Count_BST_nodes_that_lie_in_a_given_range {
    /*
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root==null){
            return 0;
        }
        //condition1 --> if lie in between l&h
        if(root.data>=l && root.data<=h){
            return 1+ getCount(root.left,l,h)+getCount(root.right,l,h);
        }
        //condition2--> if greaterThan h
        else if(root.data>=h){
            return getCount(root.left,l,h);
        }
        //else any other condition
        else{
            return getCount(root.right,l,h);
        }
    }

     */
}
