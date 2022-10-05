package DSA_Problems;

public class Subsequences_of_a_String_Recursion {
    //Subsequences of a string, Time complexity O(2^n)
    public static void subSequences(String str, int idx, String newString){
        //step2, base condition
        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
        //step1
        char currentChar = str.charAt(idx);
        //currChar have two choices-->
        //to be
        subSequences(str,idx+1,newString+currentChar);
        //not to be
        subSequences(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str,0,"");
    }
}
