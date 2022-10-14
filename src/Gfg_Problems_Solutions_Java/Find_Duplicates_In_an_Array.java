package Gfg_Problems_Solutions_Java;
import java.util.*;
public class Find_Duplicates_In_an_Array {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i=0;i<n;i++){
            if(s1.contains(arr[i])){
                s2.add(arr[i]);
            }
            else s1.add(arr[i]);
        }
        for(int e : s2){
            list.add(e);
        }
        if(list.size()==0){
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }
}
