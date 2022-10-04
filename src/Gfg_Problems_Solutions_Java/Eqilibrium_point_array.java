package Gfg_Problems_Solutions_Java;

public class Eqilibrium_point_array {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int totSum = 0;
        int tempSum = 0;

        for(int i=0;i<n;i++){
            totSum+=arr[i];
        }

        for(int i=0;i<n;i++){
            if((totSum-tempSum-arr[i])==tempSum){
                return i+1;
            }

            tempSum +=arr[i];
        }
        return -1;
    }
}
