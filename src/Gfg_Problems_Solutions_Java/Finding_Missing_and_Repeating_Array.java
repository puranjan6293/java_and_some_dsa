package Gfg_Problems_Solutions_Java;
import java.util.*;
public class Finding_Missing_and_Repeating_Array {
    int[] findTwoElement(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        //for adding element in to the map
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        int[] ans = new int[2];

        //for repeating number
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==2){
                ans[0]=arr[i];
                break;
            }
        }

        //for smallest positive number
        for(int i=0;i<n;i++){
            if(map.containsKey(i+1)){
                continue;
            }
            else{
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
}
