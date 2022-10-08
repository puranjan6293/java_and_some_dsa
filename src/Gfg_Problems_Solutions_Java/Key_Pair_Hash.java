package Gfg_Problems_Solutions_Java;

import java.util.HashSet;

public class Key_Pair_Hash {
    //y=x-arr[i] formula
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(arr[i])){
                return true;
            }
            else{
                hs.add(x-arr[i]);
            }

        }
        return false;

    }
}
