package Dsa.company;

public class Sorting_dataStructure {
    //for printing the array
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    /*
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
     */
    //Quick sort , time complexity is O(nlog n) & in worst case O(n^2)
    //making pivot
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1; //it tracks & locates the empty space for putting the smaller element than pivot in the array
        for (int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //making empty space for the pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high]; //pivot is the arr[high]
        arr[high] = temp;

        //ans
        return i; //pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
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


        //for merged sort
        divide(arr,0,n-1);

         */
        //For Quick sort technique
        quickSort(arr, 0, n-1);

        //printing the array
        printArray(arr);
    }
}
