package Gfg_Problems_Solutions_Java;

public class Number_of_one_bits_BitMagic {
    static int setBits(int N) {
        // code here
        int count =0;
        while(N>0){
            if((N&1)==1){
                count++;
            }
            // N=N/2;
            N=N>>1;
        }
        return count;
    }
}
