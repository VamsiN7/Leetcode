// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxP=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min;
            maxP=Math.max(maxP,profit);
            min=Math.min(prices[i],min);
        }
        return maxP;
    }
}
