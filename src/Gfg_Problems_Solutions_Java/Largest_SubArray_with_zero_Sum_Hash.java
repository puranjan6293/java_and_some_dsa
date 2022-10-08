package Gfg_Problems_Solutions_Java;

import java.util.HashMap;

public class Largest_SubArray_with_zero_Sum_Hash {
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> M = new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==0){
                len =i+1;
            }
            if(M.containsKey(sum)){
                len=Math.max(len,i-M.get(sum));
            }
            else{
                M.put(sum,i);
            }
        }
        return len;
    }
}
