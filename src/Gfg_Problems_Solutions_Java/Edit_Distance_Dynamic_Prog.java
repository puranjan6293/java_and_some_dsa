package Gfg_Problems_Solutions_Java;

public class Edit_Distance_Dynamic_Prog {
    public int editDistance(String s, String t) {
        // Code here
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m+1][n+1];

        //base case
        for(int i=0;i<=m;i++) dp[i][0] = i;
        for(int j=0;j<=n;j++) dp[0][j] = j;

        //Approach
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                //case1, character same
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                //case2, chracter not same
                else{
                    //minimum of diagonal and uper
                    dp[i][j] = 1+Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
