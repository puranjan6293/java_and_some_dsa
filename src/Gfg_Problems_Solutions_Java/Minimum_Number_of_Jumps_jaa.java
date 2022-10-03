package Gfg_Problems_Solutions_Java;

public class Minimum_Number_of_Jumps_jaa {
    static int minJumps(int[] arr){
        // your code here
        if (arr[0]==0 && arr.length<=1) return 0;
        if(arr.length<=1){
            return -1;
        }
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1){
                return jump;
            }
            step--;
            maxReach = Math.max(maxReach,arr[i]+i);
            if(step==0){
                jump++;
                step= maxReach-i;
            }
            if(step<=0){
                return -1;
            }
        }
        return jump;
    }
}
