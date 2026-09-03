class Solution {
    static int func(int i,int target,int[] arr,int sum,int[][] dp){
        // int[][] dp = new int[101][101];
        if(sum==target){
            return 1;
        }
        if(sum > target || i>=arr.length){
            return 0;
        }
        if(dp[i][sum]!= -1){
            return dp[i][sum];
        }
        int c1 = func(i,target,arr,sum+arr[i],dp);
        int c2 = func(i+1,target,arr,sum,dp);

        dp[i][sum] = c1 + c2;
        return dp[i][sum];
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int i=0;i<=n;i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = func(0,amount,coins,0,dp);
        return ans;
    }
}


