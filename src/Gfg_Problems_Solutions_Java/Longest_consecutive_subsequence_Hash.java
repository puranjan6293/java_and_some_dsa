package Gfg_Problems_Solutions_Java;

import java.util.HashSet;

public class Longest_consecutive_subsequence_Hash {
    //Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        for(int e:arr){
            set.add(e);
        }

        int ans = 0;
        for(int a:arr){
            if(!set.contains(a-1)){
                int count =1;
                while(set.contains(++a)){
                    count++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}
