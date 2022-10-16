package Gfg_Problems_Solutions_Java;

public class Second_Largest_in_an_Array {
    int print2largest(int arr[], int n) {
        // code here
        int max = arr[0];
        int smax = -1;

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=1;i<n;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        return smax;
    }
}
