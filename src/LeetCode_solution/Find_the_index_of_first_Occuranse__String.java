package LeetCode_solution;

public class Find_the_index_of_first_Occuranse__String {
    public int strStr(String haystack, String needle) {
        //approach1
        // return haystack.indexOf(needle);
        /*
        //approach2
        int result = -1;  //intialize result to -1
        if(haystack.contains(needle)) { //check haystack contains needle or not
            int index = haystack.indexOf(needle);// get the index of haystack
            result = index;// if "YES" , assign the index of needle to result
        }
        return result;
        */

        // approach3, twopointers

        //base condition
        int n = haystack.length();
        int m = needle.length();
        if(n==0) return -1;
        if(m==0) return 0;

        int i=0;
        int j=0;

        while(i<n && j<m){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            else{
                i = i-j+1;
                j=0;
            }
        }
        if(j==m) return i-j;
        return -1;
    }
}
