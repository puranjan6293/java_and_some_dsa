package LeetCode_solution;

import java.util.Arrays;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        //Approach1
        /*
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(s.length()!=t.length()) return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
        */
        //Approach2
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;

        String fs = sortString(s);
        String ss = sortString(t);

        return fs.equals(ss);
    }
    String sortString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
