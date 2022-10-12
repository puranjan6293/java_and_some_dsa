package Gfg_Problems_Solutions_Java;

public class Convert_array_into_ZigZag_fashion_Array {
    void zigZag(int arr[], int n) {
        // code here
        for(int i = 0;i<n-1;i++){
            if(i%2==0 && arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            else if(i%2!=0 && arr[i]<arr[i+1]){
                int temp1 = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp1;
            }
        }
    }
}
