package Gfg_Problems_Solutions_Java;

public class Josephus_problem_BitMagic {
    public int josephus(int n, int k)
    {
        //Your code here
        /*
        //ans1, Iteretive method
        int ans =0;
        for(int i=2;i<=n;i++){
            ans = (ans+k)%i;
        }
        return ans+1;
        */
        //ans2 , recursive method
        if(n==1) return 1;
        return ((josephus(n-1,k)+(k-1))%n)+1;
    }
}
