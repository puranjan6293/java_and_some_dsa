package Gfg_Problems_Solutions_Java;
import java.util.*;
public class Smallest_Positive_Missing_Number_Array {
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(arr[i], 1);
        }
        for(int i=0;i<=size;i++){
            if(map.containsKey(i+1)){
                continue;
            }
            else {
                return i+1;
            }
        }
        return -1;
    }
}
