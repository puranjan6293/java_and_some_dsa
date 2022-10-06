package Gfg_Problems_Solutions_Java;

import java.util.Arrays;

public class Anagram_String {
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {

        // Your code here
        char[]a1 = a.toCharArray();
        char[]b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(a1.length!=b1.length){
            return false;
        }
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=b1[i]){
                return false;
            }
        }
        return true;


    }
}
