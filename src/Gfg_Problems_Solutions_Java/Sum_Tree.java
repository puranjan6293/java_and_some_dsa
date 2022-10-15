package Gfg_Problems_Solutions_Java;

public class Sum_Tree {
    /*
    boolean isSumTree(Node root)
    {
        // Your code here
        int val = sumTree(root);
        if(val==-1){
            return false;
        }
        else return true;

    }
    static int sumTree(Node root){
        if(root==null){
            return 0;
        }
        int sum = 0;
        if(root.left!=null){
            int val = sumTree(root.left);
            if(val==-1) return -1;
            sum+=val;
        }
        if(root.right!=null){
            int val = sumTree(root.right);
            if(val==-1) return -1;
            sum+=val;
        }

        if(sum==0 || sum==root.data) return sum+root.data;
        else return -1;
    }

     */
}
