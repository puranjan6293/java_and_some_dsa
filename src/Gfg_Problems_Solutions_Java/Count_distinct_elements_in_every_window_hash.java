package Gfg_Problems_Solutions_Java;

import java.util.ArrayList;
import java.util.HashMap;

public class Count_distinct_elements_in_every_window_hash {
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i=0;
        while(i<A.length){
            if(i<k){
                hm.put(A[i], hm.getOrDefault(A[i],0)+1);
            }
            else{
                al.add(hm.size());
                hm.put(A[i-k],hm.getOrDefault(A[i-k],0)-1);
                if(hm.get(A[i-k])==0){
                    hm.remove(A[i-k]);
                }
                hm.put(A[i], hm.getOrDefault(A[i],0)+1);
            }
            i++;
        }
        al.add(hm.size());
        return al;
    }
}
