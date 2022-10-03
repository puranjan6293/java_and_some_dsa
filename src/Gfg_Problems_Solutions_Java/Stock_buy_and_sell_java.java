package Gfg_Problems_Solutions_Java;

import java.util.ArrayList;

public class Stock_buy_and_sell_java {
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<n;i++){
            if(A[i]>A[i-1]){
                ArrayList<Integer> lis = new ArrayList<>();
                lis.add(i-1);
                lis.add(i);
                list.add(lis);
            }
        }
        return list;

    }
}
