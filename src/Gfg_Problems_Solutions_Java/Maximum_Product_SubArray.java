package Gfg_Problems_Solutions_Java;

public class Maximum_Product_SubArray {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maxval = arr[0];
        long minval = arr[0];
        long result = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]==0){
                maxval = 1;
                minval = 1;
                continue;
            }
            long temp1 = arr[i]*maxval;
            long temp2 = arr[i]*minval;

            maxval = Math.max(temp1, temp2);
            maxval = Math.max(maxval, arr[i]);

            minval = Math.min(temp1, temp2);
            minval = Math.min(minval, arr[i]);

            result = Math.max(result, maxval);
        }
        return result;
    }
}
