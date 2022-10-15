package Gfg_Problems_Solutions_Java;
import java.util.*;
public class subArray_With_Given_Sum_Array {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int currSum = 0;
        int start = 0;
        int end = -1;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            currSum+=arr[i];

            if(currSum-s==0){
                start = 0+1; end = i+1;
                list.add(start);
                list.add(end);
                break;
            }
            if(map.containsKey(currSum-s)){
                start = map.get(currSum-s)+2;
                end = i+1;
                list.add(start);
                list.add(end);
                break;
            }
            map.put(currSum, i);
        }
        if(end==-1){
            list.add(-1);
        }
        return list;
    }
}
