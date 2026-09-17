class Solution {
    public int func(int i,int j,String s,String t,int[][] dp){
        int n = s.length();
        int m = t.length();
        if(i>=n || j>=m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j] = 1 + func(i+1,j+1,s,t,dp);
        }
        else{
            int c1 = func(i+1,j,s,t,dp);
            int c2 = func(i,j+1,s,t,dp);
            dp[i][j] = Math.max(c1,c2);
        }
        return dp[i][j];

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        // StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return func(0,0,text1,text2,dp);
    }
}



