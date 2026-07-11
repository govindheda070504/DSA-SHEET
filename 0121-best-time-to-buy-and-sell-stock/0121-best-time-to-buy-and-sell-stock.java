class Solution {
    public int maxProfit(int[] prices) {

        // minprice = lowest buying price seen so far
        // maxprofit = maximum profit we can make
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        // Traverse each day's stock price
        for (int i = 0; i < prices.length; i++) {

            // Update the best (lowest) buying price till today
            minprice = Math.min(prices[i], minprice);

            // Profit if we sell today after buying at minprice
            // Update maxprofit if this profit is higher
            maxprofit = Math.max(prices[i] - minprice, maxprofit);
        }

        // Return the maximum profit possible
        return maxprofit;
    }
}