package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class count_triplets_with_sum_smaller_than_X_twopointers {
    long countTriplets(long arr[], int n,int sum)
    {
        //code here
        Arrays.sort(arr);
        long count = 0;
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;

            while(left<right){
                if(arr[left]+arr[right]<sum-arr[i]){
                    count+=(right-left);
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return count;
    }
}
