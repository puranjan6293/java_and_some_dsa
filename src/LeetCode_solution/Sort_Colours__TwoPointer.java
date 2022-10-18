package LeetCode_solution;

public class Sort_Colours__TwoPointer {
    public void sortColors(int[] nums) {
        //Approach1, uning Collection frameWork
        // Arrays.sort(nums);

        //Approach2, using Two pointers
        int n = nums.length;
        int i = 0;
        int st = 0;
        int end = n-1;

        while(i<=end && st<end){

            if(nums[i]==0){
                nums[i] = nums[st];
                nums[st] = 0;
                st++;
                i++;
            }
            else if(nums[i]==2){
                nums[i] = nums[end];
                nums[end] = 2;
                end--;
            }
            else i++;
        }
    }
}
