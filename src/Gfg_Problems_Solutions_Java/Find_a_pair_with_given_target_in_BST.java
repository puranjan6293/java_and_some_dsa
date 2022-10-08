package Gfg_Problems_Solutions_Java;

public class Find_a_pair_with_given_target_in_BST {
    /*
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target)
    {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        return check(root, set, target);

    }
    public static int check(Node root, HashSet<Integer> set, int target){
        if(root==null){
            return 0;
        }
        if(set.contains(target-root.data)){
            return 1;
        }
        else{
            set.add(root.data);
        }

        int leftSide = check(root.left, set, target);
        if(leftSide==1){
            return 1;
        }
        int rightSide = check(root.right, set, target);
        return rightSide;
    }

     */
}
