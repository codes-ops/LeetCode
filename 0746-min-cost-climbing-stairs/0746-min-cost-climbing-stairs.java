class Solution {
    public int func(int[] arr,int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int c1 = arr[n-1] + func(arr,n-1,dp);
        int c2 = arr[n-2] + func(arr,n-2,dp);
        return dp[n] = Math.min(c1,c2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp,-1);
        }
        return func(cost,n,dp);
    }
}



