package Gfg_Problems_Solutions_Java;

public class Array_to_BST {
    int i=0;
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        arrToBst(nums,left,right,arr);
        return arr;
    }
    public void arrToBst(int[] nums, int left, int right, int[] arr){
        if(left>right){
            return;
        }
        int mid = left+(right-left)/2;
        arr[i++] = nums[mid];
        arrToBst(nums,left,mid-1,arr);
        arrToBst(nums,mid+1,right,arr);
    }
}
