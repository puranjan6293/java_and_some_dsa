package Gfg_Problems_Solutions_Java;

public class Peek_element_Array {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr,int n)
    {
        //add code here.
        int peek = arr[0]; //let this is peek
        int idx = 0; //the index
        for(int i=1;i<n;i++){
            if(arr[i]>peek){
                idx = i;
                peek = arr[i];
            }
        }
        return idx;
    }
}
