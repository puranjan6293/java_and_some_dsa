package Gfg_Problems_Solutions_Java;

public class Dam_of_candies_toPointers {
    static int maxCandy(int height[], int n)
    {
        // Your code goes here
        int i=0,j=n-1;
        int res=(j-i-1)*Math.min(height[i],height[j]);
        while(j>i){
            if(height[j]>height[i]){
                i++;
            }
            else
                j--;
            res=Math.max(res,(j-i-1)*Math.min(height[i],height[j]));
        }
        if(res<0)
            return 0;
        return res;
    }
}
