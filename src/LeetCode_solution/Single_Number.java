package LeetCode_solution;

public class Single_Number {
    public int singleNumber(int[] nums) {
        /*
        //Approach1
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){  //Check pairwise values in array
                return nums[i]; //if any pairwise values are different, then it is answer
            }
        }
        return nums[nums.length-1];
        //if answer is largest value, then it will not be detected in above loop hence return it here
        */

        //Approach2, using XOR operator
        /*This operator is a binary operator, denoted by ‘^.’ It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0. */
        int ans = 0;
        for(int x:nums){
            ans = ans^x;
        }
        return ans;
    }
}
