class Solution {
    public int func(int n,int score,int streak,int[][] dp){
        if(score==n){
            return 0;
        }
        if(score>n){
            return (int)1e9;
        }
        if(dp[score][streak]!=-1){
            return dp[score][streak];
        }
        int a = 1 + func(n,score+streak+1,streak+1,dp);
        int b = (int)1e9;
        if(streak>0){
            b = 1 + func(n,score,0,dp);
        }
        return dp[score][streak]=Math.min(a,b);
    }
    public int minDays(int n) {
        int[][] dp  = new int[n][460];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = func(n,0,0,dp);
        return ans;
    }
}





