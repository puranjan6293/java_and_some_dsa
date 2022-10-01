package DSA_Problems;
import java.util.*;
//Question-1 find the maximum and minimum element of an array
public class Array_Question_1 {
    static class Pair{
        int min;
        int max;
    }
    static Pair GetMinMax(int arr[],int n){
        Pair minMax = new Pair();
        int i;
        /*If there is only one element then return it as min and max both*/
        if (n==1){
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }
        if (arr[0]>arr[1]){
            minMax.max = arr[0];
            minMax.min = arr[1];
        }
        else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }
        for (i = 2; i<n; i++){
            if (arr[i]> minMax.max){
                minMax.max = arr[i];
            }
            else if (arr[i]< minMax.min) {
                minMax.min = arr[i];
            }
        }
        return minMax;
    }
    public static void main(String[] args) {
        int[]arr = {2,5,7,10,45,1,30};
        /*
        //type-1
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
         */
        //Type-2
        int arr_size = arr.length;
        Pair minMax = GetMinMax(arr,arr_size);
        System.out.println("Minimum element is: "+minMax.min);
        System.out.println("Maximum element is: "+minMax.max);


    }
}
