package LeetCode_solution;

public class Missing_number {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int total=len*(len+1)/2;

        for(int i=0;i<len;i++){
            total-=nums[i];
        }
        return total;
    }
}
