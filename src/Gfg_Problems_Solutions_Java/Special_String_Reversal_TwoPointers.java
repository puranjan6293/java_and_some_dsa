package Gfg_Problems_Solutions_Java;

public class Special_String_Reversal_TwoPointers {
    public String reverse(String str)
    {
        //complete the function here
        String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] arr = str.toCharArray();
        int first = 0;
        int last = arr.length-1;

        while(first<last){
            while(first<last && !temp.contains(arr[first]+"")){
                first++;
            }
            while(first<last && !temp.contains(arr[last]+"")){
                last--;
            }
            char t = arr[first];
            arr[first] = arr[last];
            arr[last] = t;

            first++;
            last--;
        }
        return new String(arr);
    }
}
