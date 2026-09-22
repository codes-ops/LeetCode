class Solution {
    public int func(int[] nums,int n,int i,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int a = nums[i] + func(nums,n,i+2,dp);
        int b = func(nums,n,i+1,dp);

        return dp[i]=Math.max(a,b);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp = new int[n+1];
        int[] dp2 = new int[n+1];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        int a =  func(nums,n-1,0,dp);
        int b =  func(nums,n,1,dp2);

        return Math.max(a,b);
        
    }
}

