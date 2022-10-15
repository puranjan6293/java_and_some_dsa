package Gfg_Problems_Solutions_Java;

public class Kadanes_Algorithm_DynamicProg {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){

        // Your code here
        long maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<n;i++){
            currSum = currSum+arr[i];

            if(currSum>maxSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
