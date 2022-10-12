package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class Minimize_the_heights_Array {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[n-1];
        int ans = max-min;

        for(int i=0;i<n-1;i++){
            max = Math.max(arr[i]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i+1]-k);
            if(min<0){
                continue;
            }
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}
