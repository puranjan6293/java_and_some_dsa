package DSA_Problems;
//Find the first and last occurrence of a element in a string, Time complexity --> O(n)
public class Find_First_and_last_Occurence_Recursion {
    //step1
    public static int first = -1;
    public static int last = -1;
    public static void firstLastIndex(String str, int idx, char element){
        //step3
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        //step2
        char current = str.charAt(idx);
        if(current==element){
            if(first==-1){
                first = idx;
            }
            else {
                last = idx;
            }
        }
        firstLastIndex(str,idx+1,element);
    }
    public static void main(String[] args) {
        firstLastIndex("puranjanmallik",0,'a');

    }
}
