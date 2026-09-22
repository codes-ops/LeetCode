class Solution {
    public int func(int m,int n,int i,int j,int[][] dp){
        if(i>=m || j>=n){
            return 0;
        }
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = func(m,n,i,j+1,dp);
        int down = func(m,n,i+1,j,dp);
        return dp[i][j]=right+down;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return func(m,n,0,0,dp);
    }
}


