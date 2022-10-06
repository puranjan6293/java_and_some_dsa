package Gfg_Problems_Solutions_Java;

public class Longest_common_Prefix_in_an_Array_String {
    String longestCommonPrefix(String arr[], int n){
        // code here
        String prefix = arr[0];
        for(int i=1;i<n;i++){
            while(!arr[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0) return "-1";
            }
        }
        return prefix;
    }
}
