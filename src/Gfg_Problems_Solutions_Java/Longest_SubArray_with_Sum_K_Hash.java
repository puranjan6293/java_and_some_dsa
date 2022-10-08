package Gfg_Problems_Solutions_Java;

import java.util.HashMap;

public class Longest_SubArray_with_Sum_K_Hash {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            prefixSum+=A[i]; //calculating prefix sum
            if(prefixSum==K){
                maxLen = i+1;
            }
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
            }
            if(map.containsKey(prefixSum-K)){
                maxLen = Math.max(maxLen,i-map.get(prefixSum-K));
            }
        }
        return maxLen;
    }
}
