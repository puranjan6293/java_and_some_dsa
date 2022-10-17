package LeetCode_solution;

public class Recover_a__BST {
    /*
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;
    TreeNode mid = null;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        if(first!=null && second!=null){
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
        else if(first!=null && mid!=null){
            int temp = first.val;
            first.val = mid.val;
            mid.val = temp;
        }
    }
    void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        if(prev!=null && root.val<prev.val){
            if(first==null){
                first=prev;
                mid=root;
            }
            else second=root;
        }
        prev=root;
        inOrder(root.right);
    }

     */
}
