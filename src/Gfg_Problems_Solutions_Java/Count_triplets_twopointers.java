package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class Count_triplets_twopointers {
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for (int i=0;i<n;i++){
            int sum=arr[i];
            int left = 0;
            int right = n-1;

            while(left<right){
                int temp = arr[left]+arr[right];
                if(sum==temp){
                    count++;
                    left++;
                    right--;
                }
                else if(temp<sum){
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
