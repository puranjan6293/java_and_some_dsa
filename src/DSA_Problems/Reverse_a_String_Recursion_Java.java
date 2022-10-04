package DSA_Problems;

public class Reverse_a_String_Recursion_Java {
    //Reverse a string , time complexity --> O(n), n is the length of the string
    public static void reverseString(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverseString(str,idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverseString(str,str.length()-1);

    }
}
