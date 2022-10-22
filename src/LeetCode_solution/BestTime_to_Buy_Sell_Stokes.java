package LeetCode_solution;

public class BestTime_to_Buy_Sell_Stokes {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int firstMin = prices[0]; //taking 0th index as first buy day

        for(int i=0;i<prices.length;i++){
            firstMin = Math.min(firstMin, prices[i]);
            int profit = prices[i]-firstMin;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
