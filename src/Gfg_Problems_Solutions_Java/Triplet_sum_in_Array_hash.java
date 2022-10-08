package Gfg_Problems_Solutions_Java;

import java.util.HashSet;

public class Triplet_sum_in_Array_hash {
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        for(int i=0; i<n-1; i++){
            HashSet<Integer> S = new HashSet<>();
            for(int j=i+1;j<n;j++){
                if(S.contains(X-(A[i]+A[j]))){
                    return true;
                }
                else{
                    S.add(A[j]);
                }
            }
        }
        return false;

    }
}
