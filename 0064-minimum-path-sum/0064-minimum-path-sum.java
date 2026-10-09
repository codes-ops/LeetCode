class Solution {
    public int func(int n,int m,int i,int j,int[][] grid,int[][] dp){
        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int a = func(n,m,i+1,j,grid,dp);
        int b = func(n,m,i,j+1,grid,dp);

        return dp[i][j]=grid[i][j] + Math.min(a,b);
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return func(n,m,0,0,grid,dp);
    }
}




