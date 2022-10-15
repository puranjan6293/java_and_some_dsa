package Gfg_Problems_Solutions_Java;

public class Maximum_PathSum_in_Matrix_DynamicProg {
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int[][] dp = new int[N][N];

        for(int i=1;i<N;i++){
            for(int j=0;j<N;j++){
                int a = -1;
                int b = -1;

                if(j-1>=0){
                    a = Matrix[i-1][j-1];
                }
                if(j+1<N){
                    b = Matrix[i-1][j+1];
                }
                Matrix[i][j] = Matrix[i][j]+Math.max(Math.max(a,b), Matrix[i-1][j]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            max = Math.max(max,Matrix[N-1][i]);
        }
        return max;
    }
}
