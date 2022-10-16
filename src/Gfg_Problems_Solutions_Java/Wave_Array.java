package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class Wave_Array {
    public static void convertToWave(int n, int[] a) {
        // code here
        Arrays.sort(a);
        for(int i=0;i<n-1;i=i+2){
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
    }
}
