package Gfg_Problems_Solutions_Java;

import java.util.*;

public class Minimum_Number_of_coins_Dynamic_Prog {
    static List<Integer> minPartition(int N)
    {
        // code here
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
        int count = 0;
        int amount = N;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(coins,Collections.reverseOrder());

        for(int i=0;i<coins.length;i++){
            while(amount-coins[i]>=0){
                ans.add(coins[i]);
                amount-=coins[i];
            }
        }
        return ans;
    }
}
