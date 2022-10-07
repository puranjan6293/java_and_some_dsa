package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class Minimize_the_height_Greedy_and_twopointer {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        int ans = max-min;

        for(int i=1;i<n;i++){
            min = Math.min(arr[0]+k,arr[i]-k);
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}
