package LeetCode_solution;

public class First_And_Last_Position_in__Array {
    public static int findStartIndex(int[] nums, int start, int end, int target){
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                ans = mid;
                end = mid-1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static int findEndIndex(int[] nums, int start, int end, int target){
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] ans = new int[2];
        ans[0] = findStartIndex(nums,start,end,target);
        ans[1] = findEndIndex(nums,start,end,target);
        return ans;
    }
}
