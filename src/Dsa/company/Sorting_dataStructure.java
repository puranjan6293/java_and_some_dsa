package Dsa.company;

public class Sorting_dataStructure {
    //for printing the array
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
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

         */

        //Selection sort
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


        //printing the array
        printArray(arr);
    }
}
