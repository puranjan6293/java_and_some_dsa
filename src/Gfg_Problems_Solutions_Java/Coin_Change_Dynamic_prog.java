package Gfg_Problems_Solutions_Java;

public class Coin_Change_Dynamic_prog {
    public long count(int coins[], int N, int sum) {
        // code here.
        long[][] dp = new long[sum+1][coins.length];
        return solve(coins, sum, 0, dp);
    }
    public long solve(int[] coins, int sum, int vidx, long[][] dp){
        if(sum==0) return 1;
        if(vidx>=coins.length) return 0;
        if(coins[vidx]>sum) return 0;

        if(dp[sum][vidx]!=0) return dp[sum][vidx];

        long include = solve(coins, sum-coins[vidx],vidx, dp);
        long exclude = solve(coins, sum, vidx+1, dp);

        dp[sum][vidx] = include+exclude;

        return dp[sum][vidx];
    }
}
