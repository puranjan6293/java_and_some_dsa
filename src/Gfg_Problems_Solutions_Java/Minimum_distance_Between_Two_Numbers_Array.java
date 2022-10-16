package Gfg_Problems_Solutions_Java;

public class Minimum_distance_Between_Two_Numbers_Array {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int start = 0;
        int end = -1;
        int minDis = Integer.MAX_VALUE;

        for(start = 0;start<n;start++){
            if(a[start]==x || a[start]==y){

                if(end!=-1 && a[end]!=a[start]){
                    minDis = Math.min(minDis, (start-end));
                }
                end = start;
            }
        }
        if(minDis == Integer.MAX_VALUE) return -1;
        return minDis;
    }
}
