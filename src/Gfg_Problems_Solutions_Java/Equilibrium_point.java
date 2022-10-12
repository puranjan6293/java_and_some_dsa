package Gfg_Problems_Solutions_Java;

public class Equilibrium_point {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum1 = 0;
        for(int i=0;i<n;i++){
            sum1+=arr[i];
        }

        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum1-=arr[i];
            if(sum1==sum2){
                return i+1;
            }
            sum2+=arr[i];
        }
        return -1;

    }
}
