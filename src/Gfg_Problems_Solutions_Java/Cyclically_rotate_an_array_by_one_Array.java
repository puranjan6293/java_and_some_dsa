package Gfg_Problems_Solutions_Java;

public class Cyclically_rotate_an_array_by_one_Array {
    public void rotate(int arr[], int n)
    {
        reverse(arr, 0, n-2);
        reverse(arr, 0, n-1);
    }
    static void reverse(int arr[] ,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
