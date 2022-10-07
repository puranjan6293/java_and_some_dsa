package Gfg_Problems_Solutions_Java;

import java.util.HashSet;

public class Intersection_of_to_Arrays_HashSet {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> h = new HashSet<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        for(int j=0;j<m;j++){
            if(h.contains(b[j])){
                cnt++;
                h.remove(b[j]);
            }
        }
        return cnt;
    }
}
