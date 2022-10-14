package Gfg_Problems_Solutions_Java;

public class Trapping_Rain_Water_Array {
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        // Your code here
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i - 1],arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i + 1],arr[i]);
        }
        long ans = 0;
        for(int i=0;i<n;i++){
            ans += (Math.min(left[i],right[i]) - arr[i]);
        }
        return ans;
    }
}