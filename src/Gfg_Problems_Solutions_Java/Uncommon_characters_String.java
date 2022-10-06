package Gfg_Problems_Solutions_Java;

import java.util.Arrays;
import java.util.HashSet;

public class Uncommon_characters_String {
    String UncommonChars(String A, String B)
    {
        // code here
        if(A.equals((B))) return "-1";
        if(A.length()==0) return B;
        if(B.length()==0) return A;

        HashSet<Character> s1 = new HashSet<>();
        HashSet<Character> s2 = new HashSet<>();
        HashSet<Character> s3 = new HashSet<>();

        for(char a:A.toCharArray()){
            s1.add(a);
        }
        for(char b:B.toCharArray()){
            s2.add(b);
        }
        s3.addAll(s1);
        s3.addAll(s2);
        s1.retainAll(s2); //remove specific collection of elements
        s3.removeAll(s1); //remove all collection of elements
        if(s3.size()==0) return "-1";
        StringBuilder s = new StringBuilder();
        for(char a:s3){
            s.append(a);
        }
        char[] arr = s.toString().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
