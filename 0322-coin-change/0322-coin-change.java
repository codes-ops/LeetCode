class Solution {
    static int func(int i,int target,int[] arr,int[][] dp){
        // int[][] dp = new int[101][101];
        if(target==0){
            return 0;
        }
        if(target <0 || i>=arr.length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int c1 = func(i, target - arr[i], arr, dp);
        if (c1 != Integer.MAX_VALUE) {
            c1 = 1 + c1;
            }
        int c2 = func(i+1,target,arr,dp);
        dp[i][target] = Math.min(c1,c2);
        return dp[i][target];
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int i=0;i<n;i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = func(0, amount, coins, dp);

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;

    }
}



