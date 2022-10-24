package LeetCode_solution;

public class Power_of_Three {
    public boolean isPowerOfThree(int n) {
        /*
        //Approach1
        while(n!=0 && n%3==0){
            n/=3;
        }
        return n==1;
        */
        //Approach2
        return (n>0 && 1162261467 % n == 0);
    }
}
