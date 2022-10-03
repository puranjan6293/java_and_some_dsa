package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class Minimize_the_sum_of_product_java {
    public long minValue(long a[], long b[], long n)
    {
        // Your code goes here
        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length; i++){
            result += (a[i]*b[a.length-i-1]);
        }
        return result;
    }
}
