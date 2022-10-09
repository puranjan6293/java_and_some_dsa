package Gfg_Problems_Solutions_Java;

public class Count_total_setBits_BitMagic {
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){

        // Your code here
        n++;
        int power = 2;
        int count = n/2;
        while(power<=n){
            int pairs = n/power;
            count+=(pairs/2)*power;
            count+=(pairs%2==0)?0:(n%power);
            power<<=1;
        }
        return count;
    }
}
