class Solution {
    public boolean func(int a,int i,int j,char[][] grid,int[][][] dp){
        int n = grid.length;
        int m = grid[0].length;
        if(i >= n || j >= m){
            return false;
        }
        int len = m + n - 1;
        if(grid[i][j]=='('){
            a++;
        }
        else{
            a--;
        }
        if(a>len/2 || a < 0){
            return false;
        }
        if(i == n-1 && j == m-1){
            return a==0;
        }
        if(dp[i][j][a]!=-1){
            return dp[i][j][a]==1;
        }
        boolean c = func(a,i+1,j,grid,dp);
        boolean d = func(a,i,j+1,grid,dp);
        if(c || d) {
            dp[i][j][a] = 1;
        } 
        else {
            dp[i][j][a] = 0;
        }
        return c || d;

    }
    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][101];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return func(0,0,0,grid,dp);
    }
}



