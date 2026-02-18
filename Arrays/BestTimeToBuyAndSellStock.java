// Problem: Best Time to Buy and Sell Stock
// Platform: LeetCode
// Topic: Arrays
// Difficulty: Easy
// Approach: Track minimum price and calculate max profit
// Time: O(n) | Space: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_pr = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0; i < n; i++){

            if(prices[i] < min_pr){
                min_pr = prices[i];
            }

            int profit = prices[i] - min_pr;
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;
    }
}
