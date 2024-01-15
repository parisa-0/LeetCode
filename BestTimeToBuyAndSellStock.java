class Solution {
    public int maxProfit(int[] prices) {

        int max = 0, min = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(min < prices[i]) {
                max = Math.max(prices[i]-min, max);
            }
            else {
                min = prices[i];
            }
        }

        return max;
/*
        int max = 0;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
               if(prices[j] - prices[i] > max) {
                   max = prices[j] - prices[i];
               }
            }
        }
        return max;
        */
    }
}
