package LeetCode_solution;

public class Sorted_Array_To__BST {
    /*
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        TreeNode head = arrToBst(nums, 0, nums.length-1);
        return head;
    }
    public TreeNode arrToBst(int[]nums, int low, int high){
        if(low>high){ //base condition or recursion stopping condition
            return null;
        }
        int mid = (low+high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = arrToBst(nums, low, mid-1);
        node.right = arrToBst(nums, mid+1, high);
        return node;
    }

     */
}
