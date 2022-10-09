package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class Missing_number_in_Array_BitMagic {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int curr = 1;
        for(int i=0;i<array.length;i++){
            if(array[i]!=curr){
                return curr;
            }
            curr++;
        }
        return curr;
    }
}
