package Gfg_Problems_Solutions_Java;

public class Longest_Palindrome_in_a_String_DynamicProg {
    static String longestPalin(String S){
        // code here
        /*
        //this process is taking more time
        String ans = new String();
        int maxLength=0;
        for(int i=0;i<S.length();i++){

            for(int j=i;j<S.length();j++){

                String subStr = S.substring(i,j+1);
                boolean isPalin = Solution.isPalindromic(subStr);

                if(isPalin && subStr.length()>maxLength){
                    ans = subStr;
                    maxLength = subStr.length();
                }
            }
        }
        return (ans);

    }
    public static boolean isPalindromic(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
        return (true);
    */
        int n = S.length();
        int resLen = Integer.MIN_VALUE;
        String res = "";

        for(int i = 0; i < n; i++){
            int left = i, right = i;
            while(left >= 0 && right < n && S.charAt(left) == S.charAt(right)){
                if(right - left + 1 > resLen){
                    res = S.substring(left, right + 1);
                    resLen = right - left + 1;
                }
                left--;
                right++;
            }

            left = i; right = i + 1;
            while(left >= 0 && right < n && S.charAt(left) == S.charAt(right)){
                if(right - left + 1 > resLen){
                    res = S.substring(left, right + 1);
                    resLen = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return res;
    }
}
