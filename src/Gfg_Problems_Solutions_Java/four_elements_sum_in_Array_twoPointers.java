package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class four_elements_sum_in_Array_twoPointers {
    boolean find4Numbers(int A[], int n, int X)
    {
        //code here
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        if(A[i]+A[j]+A[k]+A[l]==X){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
