package Gfg_Problems_Solutions_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_an_array {

    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n - 1]);
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
