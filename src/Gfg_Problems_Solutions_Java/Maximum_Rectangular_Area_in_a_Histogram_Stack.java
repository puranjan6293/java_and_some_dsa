package Gfg_Problems_Solutions_Java;

import java.util.Stack;

public class Maximum_Rectangular_Area_in_a_Histogram_Stack {
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n)
    {
        // your code here
        long nextS[] = new long[(int)n];
        long prevS[] = new long[(int)n];

        nextSmaller(hist, nextS);
        previousSmaller(hist, prevS);

        long ans = 0;
        for(int i=0;i<n;i++){
            int width = (int)(nextS[i]-prevS[i])-1;
            ans = Math.max(width*hist[i],ans);
        }
        return ans;
    }
    public static void nextSmaller(long hist[], long arr[]){
        Stack<Integer> st = new Stack<>();
        for(int i=hist.length-1;i>=0;i--){
            while(!st.isEmpty() && hist[st.peek()]>=hist[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=hist.length;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(i);
        }
    }
    public static void previousSmaller(long hist[], long arr[]){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && hist[st.peek()]>=hist[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = -1;
            }
            else{
                arr[i] = st.peek();
            }
            st.push(i);
        }
    }
}
