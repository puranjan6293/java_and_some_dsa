package Gfg_Problems_Solutions_Java;

import java.util.HashSet;

public class Minimum_indexed_character_String {
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<patt.length();i++){
            hs.add(patt.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            if(hs.contains(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
