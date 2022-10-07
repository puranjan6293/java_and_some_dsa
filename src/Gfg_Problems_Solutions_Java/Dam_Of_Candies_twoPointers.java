package Gfg_Problems_Solutions_Java;

public class Dam_Of_Candies_twoPointers {
    static int maxCandy(int height[], int n)
    {
        // Your code goes here
        int left = 0;
        int right = n-1;
        int max = 0;
        while(left<right){
            int leftIdx = height[left];
            int rightIdx = height[right];
            max = Math.max(max, Math.min(leftIdx,rightIdx)*(right-left-1));
            if(leftIdx<rightIdx){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
