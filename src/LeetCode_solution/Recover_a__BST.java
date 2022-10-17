package LeetCode_solution;

public class Recover_a__BST {
    /*
    TreeNode first = null;
    TreeNode second = null;
    // TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    TreeNode prev = null;
    public void recoverTree(TreeNode root) {
        //inOrder traversal to find the two elements
        traverse(root);
        //swap the values of the two nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

    }
    void traverse(TreeNode root){
        if(root==null) return;
        //traverse left
        traverse(root.left);
        //if first element is not been found, assign it to prev
        if(prev!=null){
            if(first==null && prev.val>=root.val){
            first=prev;
        }
        }
        //if first has found, assign it to second to the root
        if(first!=null && prev.val>=root.val){
            second=root;
        }
        prev=root;
        //traverse right
        traverse(root.right);
    }

     */
}
