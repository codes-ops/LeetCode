class Solution {
    public int func(int i,int j,String s,String t,int[][] dp){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
        int a = 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            a = func(i+1,j+1,s,t,dp)+func(i+1,j,s,t,dp);
        }
        if(s.charAt(i)!=t.charAt(j)){
            a = func(i+1,j,s,t,dp);
        }
        return dp[i][j]=a;
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return func(0,0,s,t,dp);
    }
}



