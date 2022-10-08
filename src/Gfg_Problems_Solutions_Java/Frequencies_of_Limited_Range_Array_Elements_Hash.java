package Gfg_Problems_Solutions_Java;

import java.util.HashMap;

public class Frequencies_of_Limited_Range_Array_Elements_Hash {
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<N;i++){
            if(map.containsKey(i+1)){
                arr[i] = map.get(i+1);
            }
            else {
                arr[i] = 0;
            }
        }
    }
}
