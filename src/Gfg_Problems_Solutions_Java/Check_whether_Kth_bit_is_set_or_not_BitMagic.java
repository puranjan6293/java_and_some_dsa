package Gfg_Problems_Solutions_Java;

public class Check_whether_Kth_bit_is_set_or_not_BitMagic {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int bitMask = 1<<k;
        if((bitMask&n)==0){
            return false;
        }
        else return true;
    }

}
