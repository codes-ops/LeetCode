class Solution {
    public int[][] dp = new int[501][501];
    public int func(int i,int prev,int max,int[]arr,int k){
        if(i==arr.length){
            return 0;
        }
        if(dp[i][prev]!=-1){
            return dp[i][prev];
        }
        max = Math.max(max, arr[i]);
        int len = i - prev + 1;
        int ans = 0;
        if(len==k){
            int a = max*len + func(i+1,i+1,0,arr,k);
            ans = a;
        }
        else{
            int a = max*len + func(i+1,i+1,0,arr,k);
            int b = func(i+1,prev,max,arr,k);
            ans = Math.max(a,b);
            // ans = Math.max(b,ans);
        }
        dp[i][prev] = ans;
        return ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return func(0,0,0,arr,k);
    }
}


