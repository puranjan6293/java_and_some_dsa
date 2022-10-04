package DSA_Problems;

import Dsa.company.Sorting_dataStructure;

public class remove_duplicates_from_a_string_recursion {
    //step1
    public static boolean[]map = new boolean[26];
    //step2
    public static void removeDuplicates(String str, int idx, String newString){
        //step7, base condition
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        //step3
        char current = str.charAt(idx);
        //step4
        if(map[current - 'a'] == true){
            //step5
            removeDuplicates(str,idx+1, newString);
        }
        //step6
        else {
            newString+=current;
            map[current-'a'] = true;
            removeDuplicates(str,idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbcdderrf";
        removeDuplicates(str,0,"");
    }
}
