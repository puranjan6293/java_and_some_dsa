package Gfg_Problems_Solutions_Java;

import java.util.HashSet;

public class First_repeated_character_String {
    String firstRepChar(String s)
    {
        // code here
        HashSet<Character> hs = new HashSet<>();
        char []arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
            else{
                return (Character.toString(arr[i]));
            }
        }
        return "-1";
    }
}
