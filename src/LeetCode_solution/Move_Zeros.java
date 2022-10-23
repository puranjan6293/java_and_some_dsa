package LeetCode_solution;

public class Move_Zeros {
    public void moveZeroes(int[] nums) {
        /*
        //Approach1
        //base case
        if(nums==null || nums.length<=1) return;
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            // 0's are found to the left of the current non-zero number, swap the 0 and non-zero entry in array
            if(nums[i]!=0 && idx++ <i){
                // Swap 0 and non-zero elements
                nums[idx-1] = nums[i];
                nums[i] = 0;
            }
        }
        */
        //Approach2
        if (nums.length == 1) return;
        int count = 0, size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        while (count < size) {
            nums[count] = 0;
            count++;
        }
    }
}
