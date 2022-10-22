package LeetCode_solution;

public class Sqrt_of_x {
    public int mySqrt(int x) {
        long r = x;
        //Approach1
        //return (int)Math.sqrt(r);

        //Approach2
        while(r*r>x){
            r = (r+x/r)/2;
        }
        return (int)r;
    }
}
