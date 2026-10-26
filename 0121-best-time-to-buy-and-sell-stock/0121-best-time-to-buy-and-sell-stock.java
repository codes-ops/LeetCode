class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        return solve(prices, 0, Integer.MAX_VALUE, dp);
    }

    public int solve(int[] prices, int i, int min, int[] dp) {
        if (i == prices.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        min = Math.min(min, prices[i]);

        int profit = prices[i] - min;

        int next = solve(prices, i + 1, min, dp);

        dp[i] = Math.max(profit, next);

        return dp[i];
    }
}







// for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 diff = prices[i] - prices[j];
//                 if(diff>max){
//                     max = diff;
//                 }
//             }
//         }





