package Gfg_Problems_Solutions_Java;

import java.util.ArrayList;

public class Count_Inversions {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    public static long merge_sort(ArrayList<Long> list, int s, int e){
        if(s>=e){
            return 0;
        }
        int mid=s+(e-s)/2;
        long l=merge_sort(list, s, mid);
        long r=merge_sort(list, mid+1, e);
        long res = merge(list, s, mid, e);
        return l+r+res;
    }

    public static long merge(ArrayList<Long> list, int s, int mid, int e){
        long res=0;
        int i=s;
        int j=mid+1;
        ArrayList<Long> C = new ArrayList<>();
        int idx=0;

        while(i<=mid && j<=e){
            if(list.get(i)<=list.get(j)){
                C.add(list.get(i));
                i++;
            }
            else{
                res+=(long)mid-i+1;
                C.add(list.get(j));
                j++;
            }
        }
        while(i<=mid){
            C.add(list.get(i));
            i++;
        }
        while(j<=e){
            C.add(list.get(j));
            j++;
        }
        idx=0;
        for(int t=s;t<=e;t++){
            list.set(t, C.get(idx));
            idx++;
        }
        return res;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        ArrayList<Long> list = new ArrayList<>();
        int s=0;
        int e=(int)N-1;
        for(int i=0;i<=e;i++){
            list.add(arr[i]);
        }

        return merge_sort(list, s, e);
    }
}
