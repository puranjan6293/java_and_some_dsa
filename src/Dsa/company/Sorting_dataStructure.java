package Dsa.company;

import java.awt.event.AdjustmentEvent;

public class Sorting_dataStructure {
    //for printing the array
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //Merge sort, Divide & conquer technique
    //conquer , Time complexity --> O(n)
    public static void conquer(int arr[],int si, int mid, int ei){
        int []merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while (idx1<=mid && idx2<=ei){
            //till doing sort
            if(arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2<=ei){
            merged[x++] = arr[idx2++];
        }
        //coping merged array elements in original array
        for (int i=0,j=si; i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }

    //Divide, time complexity--> O(log n)
    public static void divide(int arr[],int si, int ei){
        //base condition
        if (si>=ei){
            return;
        }
        int mid = si+(ei-si)/2; //for calculating the mid
        //recursively dividing
        divide(arr, si, mid);
        divide(arr,mid+1, ei);
        conquer(arr, si, mid, ei);

    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        /*

        //Bubble sort
        //time complexity O(n^2)
        for (int i=0;i<arr.length-1;i++){ //outer loop count the n-1 iteration
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j]; //storing
                    arr[j] = arr[j+1]; //changing
                    arr[j+1] = temp; //updating
                }
            }
        }




        //Selection sort, Time complexity is O(n^2)
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }



        //insertion sort , Time complexity is O(n^2)
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j=i-1;
            while (j>=0 && curr<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = curr;

        }

         */
        //for merged sort
        divide(arr,0,n-1);

        //printing the array
        printArray(arr);
    }
}
