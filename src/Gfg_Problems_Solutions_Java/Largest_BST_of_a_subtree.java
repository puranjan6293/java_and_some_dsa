package Gfg_Problems_Solutions_Java;

public class Largest_BST_of_a_subtree {
    /*
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
    //step2
        // Write your code here
        if(root==null){
            return 0;
        }
        int left = largestBst(root.left);
        int right = largestBst(root.right);
        if(isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            return left+right+1;
        }
        return Math.max(left, right);


    }
    //step1
    public static boolean isBst(Node root, int min, int max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        boolean left = isBst(root.left, min, root.data);
        boolean right = isBst(root.right,root.data, max);
        return left && right;
    }

     */
}
