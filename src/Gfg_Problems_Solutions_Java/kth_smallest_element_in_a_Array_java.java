package Gfg_Problems_Solutions_Java;

public class kth_smallest_element_in_a_Array_java {
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        int pivot = getPivot(arr,l,r);
        if(pivot==k-1)
            return arr[pivot];
        else if(pivot<k-1)
            return kthSmallest(arr,pivot+1,r,k);
        else
            return kthSmallest(arr,l,pivot-1,k);
    }
    public static int getPivot(int[] arr,int l,int r){

        int pivot = l;
        int left = l+1;
        int right = l+1;
        int n = arr.length;

        while(left<n&&right<n){

            if(arr[left]<arr[pivot]){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right++;
            }
            left++;
        }

        if(pivot != right-1){
            int temp =arr[pivot];
            arr[pivot] = arr[right-1];
            arr[right-1] = temp;
        }
        pivot = right-1;

        return pivot;
    }
}
