package LeetCode_solution;

public class Climb_Stairs {
    public int climbStairs(int n) {
        /*
        //Approach1- recursion
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        return climbStairs(n-1) + climbStairs(n-2);
        */

        //Approach2- DP + Optimization (Bottom Up Approach)
        if(n<=1) return 1;
        int prev1 = 1;
        int prev2 = 2;

        for(int i=3;i<=n;i++){
            int sum = prev1+prev2;
            prev1 = prev2;
            prev2 = sum;
        }
        return prev2;
    }
}
